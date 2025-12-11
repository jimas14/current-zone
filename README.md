# Current Zone
### A plugin for [RuneLite](https://runelite.net/)
##### [![Plugin Installs](http://img.shields.io/endpoint?url=https://api.runelite.net/pluginhub/shields/installs/plugin/current-zone)](https://runelite.net/plugin-hub/fanseman) [![Plugin Rank](http://img.shields.io/endpoint?url=https://api.runelite.net/pluginhub/shields/rank/plugin/current-zone)](https://runelite.net/plugin-hub)

Displays your current zone and region statically and on change.

## Features

### 📍 Minimap Zone Display
The plugin shows your current zone name directly beneath the minimap, making it easy to see your location at a glance. The display updates automatically as you move through different areas of Gielinor.

<screenshot>

### 🎬 Zone Change Animations
When you enter a new zone, a beautiful animated notification appears in the center of your screen, clearly displaying the zone name. This helps you stay aware of location changes, especially during quests or exploration.

<screenshot>

### 🎨 Customizable Appearance
Fully customize the look of the zone displays to match your preferences:
- **Text Color**: Choose any color for the zone text
- **Background Color**: Set the background color for better visibility
- **Toggle Overlays**: Enable or disable the minimap overlay and center screen animations independently

<screenshot>

## Installation

1. Open RuneLite
2. Navigate to the Plugin Hub
3. Search for "Current Zone"
4. Click "Install"
5. The plugin will be enabled automatically

## Configuration

Access the plugin settings through:
- **RuneLite Settings** → **Plugins** → **Current Zone**

### Available Options

- **Show Minimap Overlay**: Toggle the zone display beneath the minimap (enabled by default)
- **Show Center Overlay**: Toggle the animated zone notification when entering new areas (enabled by default)
- **Zone Text Color**: Customize the color of the zone text
- **Zone Background Color**: Customize the background color behind the text

## Supported Zones

The plugin recognizes zones across major regions of Gielinor:

- **Misthalin**: Lumbridge, Varrock, Draynor Village, Grand Exchange, and more
- **Kharidian Desert**: Al Kharid, Pollnivneach, Nardah, Menaphos, Sophanem, and desert locations
- **Asgarnia**: Falador, Port Sarim, Taverley, Rimmington, and surrounding areas
- **Kandarin**: Seers' Village, Yanille, Camelot, Ardougne, and more
- **Wilderness**: All wilderness levels and key locations
- **Morytania**: Canifis, Port Phasmatys, Burgh de Rott, and other Morytanian locations
- **Tirannwn**: Prifddinas, Lletya, and elven lands
- **Fremennik Province**: Rellekka, Jatizso, Neitiznot, and northern territories

The plugin continues to expand coverage as more zones are added. If you find a zone that isn't recognized, feel free to report it!

## How It Works

The plugin tracks your character's position in the game world and matches it against a comprehensive database of zone boundaries. When you move into a new zone, it automatically updates the display. The zone detection works across all planes (floors), so you'll see accurate zone information whether you're on the surface, in a building, or underground.

## Tips for Users

- **Questing**: Keep the center overlay enabled to easily track when you enter new quest areas
- **Exploration**: Use the minimap overlay to always know your current location while exploring
- **Customization**: Adjust colors to match your RuneLite theme or improve visibility
- **Performance**: The plugin is lightweight and won't impact your game performance

## For Developers

This plugin is open source and welcomes contributions! The zone detection system uses coordinate-based boundaries defined in `ZoneDetector.java`. If you'd like to add more zones or improve existing ones:

1. Fork the repository
2. Add zone definitions to the appropriate zone lists in `ZoneDetector.java`
3. Test your changes
4. Submit a pull request

The plugin architecture is straightforward:
- `CurrentZonePlugin.java`: Main plugin class handling zone updates
- `ZoneDetector.java`: Zone detection logic and zone definitions
- `MinimapOverlay.java`: Renders the zone display beneath the minimap
- `CenterOverlay.java`: Handles the animated center screen notification
- `PluginConfig.java`: Configuration options

## Troubleshooting

**Zone not displaying?**
- Make sure the plugin is enabled in RuneLite settings
- Check that "Show Minimap Overlay" is enabled in the plugin configuration
- Verify you're in a recognized zone (some areas may show as "Unknown" if not yet mapped)

**Center animation not showing?**
- Ensure "Show Center Overlay" is enabled
- The animation only appears when entering a *new* zone, not when staying in the same area

**Colors not visible?**
- Try adjusting the text and background colors in the plugin settings
- Ensure the colors have enough contrast for your game client theme

## Contributing

Found a missing zone? Have a feature suggestion? Contributions are welcome! Please feel free to:
- Open an issue for bugs or feature requests
- Submit pull requests for zone additions or improvements
- Share feedback and suggestions

## License

This plugin is provided as-is for the RuneLite community. Use it freely and modify it to suit your needs.

---

**Enjoy exploring Gielinor with better location awareness!** 🗺️
