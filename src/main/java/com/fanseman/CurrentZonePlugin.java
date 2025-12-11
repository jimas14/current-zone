package com.fanseman;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.PlayerChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Current Zone"
)
public class CurrentZonePlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private MinimapOverlay overlay;

	@Inject
	private CenterOverlay centerOverlay;

	private String lastZone = "";
	private WorldPoint lastLocation = null;

	@Override
	protected void startUp() {
		log.debug("Current Zone plugin started!");
		overlayManager.add(overlay);
		overlayManager.add(centerOverlay);
	}

	@Override
	protected void shutDown() {
		log.debug("Current Zone plugin stopped!");
		overlayManager.remove(overlay);
		overlayManager.remove(centerOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick event) {
		updateZone();
	}

	@Subscribe
	public void onPlayerChanged(PlayerChanged event) {
		updateZone();
	}

    private void updateZone() {
        if (client.getGameState() != GameState.LOGGED_IN || client.getLocalPlayer() == null) {
            return;
        }

        WorldPoint playerLocation = client.getLocalPlayer().getWorldLocation();

        if (lastLocation != null && lastLocation.equals(playerLocation)) {
            return;
        }

        lastLocation = playerLocation;

        String currentZone = ZoneDetector.getZoneName(playerLocation);

        if (!currentZone.equals(lastZone)) {
            lastZone = currentZone;
            log.debug("Zone changed to: {} at location (x: {}, y:{}, plane:{})",
                    currentZone, playerLocation.getX(), playerLocation.getY(), playerLocation.getPlane());
            
            // Trigger center screen animation
            centerOverlay.startAnimation(currentZone);
        }

        overlay.setCurrentZone(currentZone);
    }

	@Provides
    PluginConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(PluginConfig.class);
	}
}

