package com.jshliker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import java.awt.Color;

@ConfigGroup("minimap-current-zone")
public interface PluginConfig extends Config {
	@ConfigItem(
		keyName = "showCurrentZone",
		name = "Show Minimap Overlay",
		description = "Display the current zone name beneath the minimap"
	)
	default boolean showZoneOnMinimap() {
		return true;
	}

	@ConfigItem(
		keyName = "showCenterOverlay",
		name = "Show Center Overlay",
		description = "Display zone name animation in the center of the screen when entering a new zone"
	)
	default boolean showCenterOverlay() {
		return true;
	}

	@ConfigItem(
		keyName = "zoneTextColor",
		name = "Zone Text Color",
		description = "Color of the zone text displayed beneath the minimap"
	)
	default Color zoneTextColor() {
		return Color.WHITE;
	}

	@ConfigItem(
		keyName = "zoneBackgroundColor",
		name = "Zone Background Color",
		description = "Background color for the zone text displayed beneath the minimap"
	)
	default Color zoneBackgroundColor() {
		return Color.BLACK;
	}
}

