package com.fanseman;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.*;

/**
 * Overlay to display the player's current zone beneath the minimap.
 */
@Slf4j
public class MinimapOverlay extends Overlay {
	private final Client client;
	private final PluginConfig config;
	private final boolean testMode;

    @Setter
    private String currentZone = "Loading...";

	@Inject
	private MinimapOverlay(Client client, PluginConfig config) {
		this.client = client;
		this.config = config;
		this.testMode = false;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGH);
	}

	// Package-private constructor for testing
	MinimapOverlay(Client client, PluginConfig config, boolean testMode) {
		this.client = client;
		this.config = config;
		this.testMode = testMode;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(Overlay.PRIORITY_HIGH);
	}

    @Override
	public Dimension render(Graphics2D graphics) {
		if (!config.showZoneOnMinimap()) {
			return null;
		}
		
		// In production, check for player location. In test mode, skip this check.
		if (!testMode && (client.getLocalPlayer() == null || client.getLocalPlayer().getWorldLocation() == null)) {
			return null;
		}

		// Set position of overlay based on viewport mode
		int x, y;
		if (client.isResized()) {
			x = client.getCanvas().getSize().width - 65;
			y = 215;
		} else {
			x = client.getCanvas().getSize().width - 115;
			y = 160;
		}

		// Initialize text
		Font originalFont = graphics.getFont();
		Font boldFont = originalFont.deriveFont(Font.BOLD, 14f);
		graphics.setFont(boldFont);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		int textWidth = fontMetrics.stringWidth(currentZone);
		int textHeight = fontMetrics.getHeight();
		int padding = 6;

		// Draw background
		graphics.setColor(config.zoneBackgroundColor());
		graphics.fillRect(
			x - textWidth / 2 - padding,
			y - textHeight - padding,
			textWidth + padding * 2,
			textHeight + padding * 2
		);

		// Draw border
		graphics.setColor(new Color(255, 255, 255, 100));
		graphics.drawRect(
			x - textWidth / 2 - padding,
			y - textHeight - padding,
			textWidth + padding * 2,
			textHeight + padding * 2
		);

		// Draw shadow
		graphics.setColor(new Color(0, 0, 0, 255));
		graphics.drawString(currentZone, x - textWidth / 2 + 2, y + 2);
		
		// Draw main text
		graphics.setColor(config.zoneTextColor());
		graphics.drawString(currentZone, x - textWidth / 2, y);
		
		// Restore original font
		graphics.setFont(originalFont);

		log.debug("Rendered zone '{}' at ({}, {})", currentZone, x, y);
		return null;
	}
}
