package com.jshliker;

import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.*;

/**
 * Overlay to display zone information in the center of the screen with a fading animation.
 */
public class CenterOverlay extends Overlay {
	private final Client client;
	private final PluginConfig config;
	
	@Setter
	private String zoneName = "";
	
	@Setter
	private boolean showAnimation = false;
	
	private long animationStartTime = 0;
	private static final int FADE_IN_TICKS = 5;   // ~3 seconds (5 ticks * 0.6s)
	private static final int HOLD_TICKS = 15;     // ~9 seconds
	private static final int FADE_OUT_TICKS = 5;  // ~3 seconds
	private static final int TOTAL_TICKS = FADE_IN_TICKS + HOLD_TICKS + FADE_OUT_TICKS;
	private static final long TICK_DURATION_MS = 600; // 0.6 seconds per game tick

	@Inject
	private CenterOverlay(Client client, PluginConfig config) {
		this.client = client;
		this.config = config;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGHEST);
	}

	// Package-private constructor for testing
	CenterOverlay(Client client, PluginConfig config, boolean testMode) {
		this.client = client;
		this.config = config;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGHEST);
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		if (!config.showCenterOverlay() || !showAnimation || zoneName.isEmpty()) {
			return null;
		}

		// Calculate current tick based on elapsed time
		long currentTime = System.currentTimeMillis();
		if (animationStartTime == 0) {
			animationStartTime = currentTime;
		}
		
		long elapsedMs = currentTime - animationStartTime;
		int currentTick = (int) (elapsedMs / TICK_DURATION_MS);
		
		if (currentTick >= TOTAL_TICKS) {
			showAnimation = false;
			animationStartTime = 0;
			return null;
		}

		// Calculate alpha based on animation phase
		float alpha = 1.0f;
		if (currentTick < FADE_IN_TICKS) {
			// Fade in
			alpha = (float) currentTick / FADE_IN_TICKS;
		} else if (currentTick < FADE_IN_TICKS + HOLD_TICKS) {
			// Hold at full opacity
			alpha = 1.0f;
		} else {
			// Fade out
			int fadeOutProgress = currentTick - (FADE_IN_TICKS + HOLD_TICKS);
			alpha = 1.0f - ((float) fadeOutProgress / FADE_OUT_TICKS);
		}

		// Get canvas dimensions
		Dimension canvasSize = client.getCanvas().getSize();
		int centerX = canvasSize.width / 2;
		int centerY = canvasSize.height / 2;

		// Set up fonts
		Font originalFont = graphics.getFont();
		Font zoneFont = originalFont.deriveFont(Font.BOLD, 32f);

		graphics.setFont(zoneFont);
		FontMetrics zoneMetrics = graphics.getFontMetrics();
		int zoneWidth = zoneMetrics.stringWidth(zoneName);
		int zoneHeight = zoneMetrics.getHeight();

		// Calculate total height and spacing
		int spacing = 10;
		int totalHeight = zoneHeight + spacing;
		int padding = 20;

		// Draw background with alpha using config color
		Color bgConfigColor = config.zoneBackgroundColor();
		Color bgColor = new Color(bgConfigColor.getRed(), bgConfigColor.getGreen(), bgConfigColor.getBlue(), (int) (180 * alpha));
		graphics.setColor(bgColor);
		int bgWidth = zoneWidth + padding * 2;
		int bgHeight = totalHeight + padding * 2;
		graphics.fillRoundRect(
			centerX - bgWidth / 2,
			centerY - bgHeight / 2,
			bgWidth,
			bgHeight,
			10,
			10
		);
		
		// Draw border with alpha (using text color for border)
		Color textConfigColor = config.zoneTextColor();
		Color borderColor = new Color(textConfigColor.getRed(), textConfigColor.getGreen(), textConfigColor.getBlue(), (int) (150 * alpha));
		graphics.setColor(borderColor);
		graphics.setStroke(new BasicStroke(2));
		graphics.drawRoundRect(
			centerX - bgWidth / 2,
			centerY - bgHeight / 2,
			bgWidth,
			bgHeight,
			10,
			10
		);
		
		// Draw zone name with alpha using config color
		graphics.setFont(zoneFont);
		Color zoneColor = new Color(textConfigColor.getRed(), textConfigColor.getGreen(), textConfigColor.getBlue(), (int) (255 * alpha));
		graphics.setColor(zoneColor);
		
		// Draw shadow for zone
		Color shadowColor = new Color(0, 0, 0, (int) (200 * alpha));
		graphics.setColor(shadowColor);
		graphics.drawString(zoneName, centerX - zoneWidth / 2 + 2, centerY - totalHeight / 2 + zoneHeight + 2);
		
		graphics.setColor(zoneColor);
		graphics.drawString(zoneName, centerX - zoneWidth / 2, centerY - totalHeight / 2 + zoneHeight);
		
		// Restore original font
		graphics.setFont(originalFont);
		
		return null;
	}
	
	public void startAnimation(String zone) {
		this.zoneName = zone;
		this.showAnimation = true;
		this.animationStartTime = System.currentTimeMillis();
	}
}

