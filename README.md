# Current Zone
### A plugin for [RuneLite](https://runelite.net/)
##### [![Plugin Installs](http://img.shields.io/endpoint?url=https://api.runelite.net/pluginhub/shields/installs/plugin/current-zone)](https://runelite.net/plugin-hub/fanseman) [![Plugin Rank](http://img.shields.io/endpoint?url=https://api.runelite.net/pluginhub/shields/rank/plugin/current-zone)](https://runelite.net/plugin-hub)

Displays your current named location around the minimap and more prominently on zone change.

## Features

### Minimap Zone Display

![Minimap Overlay](/img/minimap-overlay-example.png "Minimap Overlay")

### Zone Change Animations

![Center Overlay](/img/center-overlay-example.png "Center Overlay")

### Configuration
- **Text Color & Background Color**: Both text & background colors can be customized.
- **Toggle Overlays**: Both minimap & zone change displays can be toggled on/off.

![Plugin Config](/img/plugin-config-example.png "Plugin Config")

## How It Works

Current zone is determined by the player's current x/y coordinates against a long list of WorldArea bounding boxes that make up the named zones/areas in Gielinor.

Huge shout out to [Explv's Map](https://explv.github.io/), which out-of-the-box offers a way to create a series of bounding boxes and get a list of WorldAreas.

## Contributing

Contributions are welcome to refine zone/area boundaries or add ones I haven't gotten to yet.

**Plugin files:**
- `CurrentZonePlugin.java`: Entrypoint for plugin by RuneLite client
- `ZoneDetector.java`: Core of the plugin, and where the WorldArea boundaries are defined.
- `MinimapOverlay.java`: Renders the display beneath the minimap
- `CenterOverlay.java`: Renders the animated display center-screen
- `PluginConfig.java`: Configuration options

**Testing:**
- `PluginLauncher.java`: Launches RuneLite with CurrentZonePlugin loaded (using `~/.runelite/credentials.properties`)
- `VisualTest.java`: Launches a mock RuneLite client to more easily view the overlays
- `WorldAreaOutput.java`: Helpful for copy from & pasting to [Explv's Map](https://explv.github.io/)

### Todo:
 * Finish charting all zones & areas (land, sea, underground/instanced)
 * Make minimap element alt+draggable
 * Make area/region display configurable (like `Lumbridge` instead of `Lumbridge, Kingdom of Misthalin`)

## Charting Status

### Land
| Area Name                | Charted?  |
|--------------------------|:---------:|
| Kingdom of Misthalin     | ✅        |
| Kharidian Desert         | ✅        |
| Kingdom of Asgarnia      | 🟥        |
| Kingdom of Kandarin      | 🟥        |
| Morytania                | 🟥        |
| Wilderness               | 🟥        |
| Mos Le'Harmless          | 🟥        |
| Fossil Island            | 🟥        |
| Ape Atoll                | 🟥        |
| Karamja                  | 🟥        |
| Troll Country            | 🟥        |
| Fremennik Province       | 🟥        |
| Fremennik Isles          | 🟥        |
| Lunar Isle               | 🟥        |
| Tirannwn                 | 🟥        |
| Feldip Hills             | 🟥        |
| Isle of Souls            | 🟥        |
| Kingdom of Great Kourend | 🟥        |
| Kingdom of Varlamore     | 🟥        |
| Kebos Lowlands           | 🟥        |

### Sea

| Ocean Name        | Charted?  |
|-------------------|:---------:|
| Ardent Ocean      | 🟥        |
| Unquiet Ocean     | 🟥        |
| Eastern Ocean     | 🟥        |
| Shrouded Ocean    | 🟥        |
| Western Ocean     | 🟥        |
| Northern Ocean    | 🟥        |
| Untamed Ocean     | 🟥        |
| Forgotten Ocean   | 🟥        |
| Sunset Ocean      | 🟥        |

#### Other (Underground & Instanced)

| Name                        | Charted? |
|-----------------------------|:--------:|
| Lumbridge Castle Cellar     |    🟥    |
| Mining Guild                |    🟥    |       
| Castle Wars                 |    🟥    |   
| .... this list will be long |    🟥    |
