package com.fanseman;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.coords.WorldArea;

import java.util.ArrayList;
import java.util.List;

/**
 * Detects the player's zone based on current WorldPoint coordinates and WorldArea boundaries.
 */
public class ZoneDetector {

	public static class NamedWorldArea extends WorldArea {
		final String name;
		
		NamedWorldArea(String name, int x, int y, int width, int height, int plane) {
			super(x, y, width, height, plane);
			this.name = name;
        }
	}

    /**
     * Declare Regions, Areas, and Zones
     */
	public static final NamedWorldArea GIELINOR_SURFACE = new NamedWorldArea("Gielinor Surface", 1016, 2104, 2960, 2064, 0);
	public static final NamedWorldArea UNDERGROUND_INSTANCED = new NamedWorldArea("Underground & Instanced Areas", 785, 4224, 3647, 8868, 0);
    public static final List<NamedWorldArea> REGION_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> MISTHALIN_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> MISTHALIN_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> KHARIDIAN_DESERT_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> KHARIDIAN_DESERT_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> ASGARNIA_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> ASGARNIA_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> KARAMJA_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> KARAMJA_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> KANDARIN_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> KANDARIN_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> WILDERNESS_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> WILDERNESS_ZONE_LIST = new ArrayList<>();
	
	public static final List<NamedWorldArea> MORYTANIA_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> MORYTANIA_ZONE_LIST = new ArrayList<>();
	
	public static final List<NamedWorldArea> TIRANNWN_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> TIRANNWN_ZONE_LIST = new ArrayList<>();
	
	public static final List<NamedWorldArea> FREMENNIK_PROVINCE_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> FREMENNIK_PROVINCE_ZONE_LIST = new ArrayList<>();

    /*
     * List of all Areas (Kingdoms, Oceans, etc.) and Zones (Cities/towns, Seas, etc.)
     * Regions are split by Gielinor Surface and all underground zones/instanced areas.
     * All planes > 0 are considered to be 0.
     */
	static {
		// Regions
		REGION_LIST.add(GIELINOR_SURFACE);
		REGION_LIST.add(UNDERGROUND_INSTANCED);

		// Misthalin Area & Zones
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3072, 3329, 314, 191, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3072, 3203, 195, 126, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3386, 3464, 38, 56, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3111, 3174, 6, 29, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3094, 3145, 31, 32, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3060, 3052, 93, 85, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3079, 3006, 49, 46, 0));
        MISTHALIN_AREA.add(new NamedWorldArea("Kingdom of Misthalin", 3133, 3137, 123, 66, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Lumbridge", 3181, 3195, 75, 87, 0));
		MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Lumbridge Swamp", 3140, 3141, 109, 54, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Toll Gate", 3259, 3215, 28, 25, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Tutorial Island", 3048, 3054, 106, 84, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Wizard's Tower", 3092, 3143, 36, 36, 0));
		MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Draynor Village", 3074, 3230, 64, 65, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Draynor Manor", 3083, 3330, 47, 57, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Barbarian Village", 3070, 3403, 33, 47, 0));
		MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Edgeville", 3074, 3464, 43, 55, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Cook's Guild", 3132, 3441, 21, 15, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Champion's Guild", 3184, 3349, 19, 18, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Lumber Yard", 3292, 3489, 35, 29, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Silvarea", 3340, 3475, 52, 44, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Paterdomus Temple", 3395, 3475, 29, 38, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Digsite", 3327, 3373, 66, 86, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Exam Centre", 3334, 3330, 37, 22, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Grand Exchange", 3137, 3466, 56, 52, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Varrock", 3163, 3374, 128, 82, 0));
        MISTHALIN_ZONE_LIST.add(new NamedWorldArea("Varrock", 3193, 3456, 98, 62, 0));

        // Kharidian Desert Area & Zones
        KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3271, 2769, 127, 560, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3267, 3144, 4, 178, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3258, 3149, 9, 52, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3398, 3197, 19, 122, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3398, 3160, 30, 37, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3398, 3088, 43, 72, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3428, 3160, 11, 8, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3441, 3146, 15, 10, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3456, 3136, 23, 12, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3441, 3088, 15, 58, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3456, 3116, 23, 20, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3456, 2947, 93, 169, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3398, 2879, 58, 209, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3456, 2879, 17, 68, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3398, 2769, 49, 110, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3359, 2757, 88, 12, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3294, 2709, 65, 60, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3359, 2678, 41, 79, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3332, 2677, 27, 32, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3294, 2687, 38, 22, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3271, 2698, 23, 71, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3186, 2667, 54, 54, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3240, 2698, 31, 71, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3147, 2697, 39, 24, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3147, 2721, 93, 340, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3240, 2769, 31, 292, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3204, 3061, 67, 72, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3178, 3061, 26, 6, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3172, 2633, 26, 19, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3400, 2721, 46, 25, 0));
		KHARIDIAN_DESERT_AREA.add(new NamedWorldArea("Kharidian Desert", 3400, 2752, 4, 5, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Toll Gate", 3259, 3215, 28, 25, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Al Kharid Palace", 3280, 3157, 25, 22, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Al Kharid", 3260, 3142, 65, 72, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Mage Training Arena", 3351, 3289, 25, 38, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Emir's Arena", 3325, 3201, 71, 88, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Shantay Pass", 3287, 3105, 31, 37, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Kalphite Cave", 3318, 3109, 27, 19, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Giants' Plateau", 3344, 3156, 48, 11, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Giants' Plateau", 3360, 3137, 32, 50, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Citharede Abbey", 3392, 3168, 33, 25, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Kalphite Lair", 3208, 3075, 48, 41, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Desert Mining Camp", 3271, 3012, 37, 31, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Bedabin Camp", 3157, 3023, 35, 34, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Bandit Camp", 3153, 2962, 41, 33, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Pollnivneach", 3322, 2940, 56, 66, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Uzer", 3462, 3075, 46, 39, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Uzer Oasis", 3457, 3010, 60, 65, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ancient Vault", 3498, 2954, 20, 39, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ancient Vault", 3490, 2957, 39, 26, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ancient Vault", 3468, 2969, 25, 9, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Nardah", 3396, 2881, 75, 65, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Quarry", 3155, 2889, 41, 45, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Unkah", 3149, 2816, 48, 65, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Jaldraocht Pyramid", 3214, 2879, 38, 38, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Jaleustrophos Pyramid", 3334, 2820, 52, 43, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Ullek", 3386, 2814, 63, 56, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Ullek", 3373, 2799, 51, 15, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Ullek", 3345, 2769, 41, 51, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Ullek", 3362, 2763, 48, 6, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Ruins of Ullek", 3386, 2751, 20, 48, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Necropolis", 3327, 2724, 35, 45, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Necropolis", 3302, 2699, 44, 47, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Jaltevas Pyramid", 3346, 2686, 38, 38, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Jalsavrah Pyramid", 3281, 2787, 16, 16, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Sophanem", 3273, 2748, 54, 70, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Menaphos", 3197, 2748, 76, 70, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Menaphos", 3151, 2697, 82, 102, 0));
        KHARIDIAN_DESERT_ZONE_LIST.add(new NamedWorldArea("Menaphos", 3233, 2713, 38, 35, 0));

        // Asgarnia Area & Zones
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2900, 3200, 200, 200, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Port Sarim", 3005, 3470, 50, 50, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Mining Guild", 3000, 3330, 50, 50, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Falador", 2944, 3360, 100, 100, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Rimmington", 2920, 3200, 50, 50, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Taverley", 2880, 3400, 50, 50, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Gunnarsgrunn", 2890, 3680, 40, 40, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Mudskipper Point", 2980, 3100, 40, 40, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2850, 3500, 80, 100, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Ice Mountain", 3000, 3500, 40, 40, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Dwarven Mine", 3018, 3450, 30, 30, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Asgarnian Ice Dungeon", 3000, 3150, 50, 50, 0));

        // Kandarin Area & Zones
        KANDARIN_AREA.add(new NamedWorldArea("Kingdom of Kandarin", 2500, 3000, 400, 600, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Seers' Village", 2680, 3450, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Yanille", 2540, 3070, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Camelot", 2750, 3450, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Burthorpe", 2890, 3530, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2800, 3430, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Fishing Guild", 2580, 3410, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Ardougne", 2600, 3300, 100, 100, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Tree Gnome Stronghold", 2440, 3400, 80, 80, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Tree Gnome Village", 2500, 3150, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("West Ardougne", 2500, 3300, 100, 100, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("East Ardougne", 2600, 3300, 100, 100, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Witchaven", 2700, 3300, 40, 40, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Rellekka", 2650, 3600, 60, 60, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Jatizso", 2400, 3800, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Neitiznot", 2300, 3800, 50, 50, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Lunar Isle", 2100, 3900, 80, 80, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Piscatoris", 2300, 3600, 60, 60, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Zanaris", 2400, 4400, 100, 100, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("Trollheim", 2800, 3600, 60, 60, 0));
		KANDARIN_ZONE_LIST.add(new NamedWorldArea("God Wars Dungeon", 2900, 3700, 50, 50, 0));
		
        // Wilderness Area & Zones
        WILDERNESS_AREA.add(new NamedWorldArea("Wilderness", 2940, 3520, 200, 200, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 1-10", 2940, 3520, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 11-20", 2940, 3550, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 21-30", 2940, 3580, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 31-40", 2940, 3610, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 41-50", 2940, 3640, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Wilderness Level 51-60", 2940, 3670, 200, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Mage Arena", 3090, 3950, 30, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Lava Maze", 3060, 3850, 40, 40, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Demonic Ruins", 3280, 3880, 40, 40, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Graveyard of Shadows", 3150, 3680, 40, 40, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Rogues' Castle", 3280, 3920, 30, 30, 0));
		WILDERNESS_ZONE_LIST.add(new NamedWorldArea("Dark Warriors' Fortress", 3000, 3630, 40, 40, 0));
		
		// Morytania Area & Zones
		MORYTANIA_AREA.add(new NamedWorldArea("Morytania", 3400, 3300, 200, 300, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Canifis", 3480, 3480, 60, 60, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Port Phasmatys", 3700, 3500, 50, 50, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Burgh de Rott", 3480, 3180, 50, 50, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Mort'ton", 3440, 3300, 40, 40, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Meiyerditch", 3600, 3200, 80, 100, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Darkmeyer", 3600, 3300, 60, 60, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Slepe", 3650, 3400, 50, 50, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Barrows", 3560, 3300, 40, 40, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Fenkenstrain's Castle", 3540, 3520, 30, 30, 0));
		MORYTANIA_ZONE_LIST.add(new NamedWorldArea("Morytania Swamp", 3400, 3400, 100, 100, 0));
		
		// Tirannwn Area & Zones
		TIRANNWN_AREA.add(new NamedWorldArea("Tirannwn", 2200, 3000, 200, 300, 0));
		TIRANNWN_ZONE_LIST.add(new NamedWorldArea("Lletya", 2330, 3170, 40, 40, 0));
		TIRANNWN_ZONE_LIST.add(new NamedWorldArea("Prifddinas", 2200, 3300, 100, 100, 0));
		TIRANNWN_ZONE_LIST.add(new NamedWorldArea("Tirannwn", 2200, 3000, 200, 300, 0));
		TIRANNWN_ZONE_LIST.add(new NamedWorldArea("Isafdar", 2200, 3100, 150, 200, 0));
		TIRANNWN_ZONE_LIST.add(new NamedWorldArea("Elf Camp", 2200, 3200, 50, 50, 0));
		
		// Fremennik Province Area & Zones
		FREMENNIK_PROVINCE_AREA.add(new NamedWorldArea("Fremennik Province", 2600, 3600, 200, 200, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Rellekka", 2650, 3600, 60, 60, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Miscellania", 2500, 3800, 50, 50, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Etceteria", 2600, 3800, 50, 50, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Jatizso", 2400, 3800, 50, 50, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Neitiznot", 2300, 3800, 50, 50, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Waterbirth Island", 2500, 3700, 40, 40, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Lunar Isle", 2100, 3900, 80, 80, 0));
		FREMENNIK_PROVINCE_ZONE_LIST.add(new NamedWorldArea("Keldagrim", 2800, 3700, 60, 60, 0));
	}

    public static String getZoneName(WorldPoint point) {
		// Always use plane 0 so upstairs locations are still registered
		WorldPoint normalizedPoint = new WorldPoint(point.getX(), point.getY(), 0);

		if (GIELINOR_SURFACE.contains(normalizedPoint)) {
			for (NamedWorldArea area : MISTHALIN_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : MISTHALIN_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + MISTHALIN_AREA.get(0).name;
						}
					}
					return MISTHALIN_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : KHARIDIAN_DESERT_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : KHARIDIAN_DESERT_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + KHARIDIAN_DESERT_AREA.get(0).name;
						}
					}
					return KHARIDIAN_DESERT_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : ASGARNIA_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : ASGARNIA_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + ASGARNIA_AREA.get(0).name;
						}
					}
					return ASGARNIA_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : KANDARIN_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : KANDARIN_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + KANDARIN_AREA.get(0).name;
						}
					}
					return KANDARIN_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : WILDERNESS_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : WILDERNESS_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + WILDERNESS_AREA.get(0).name;
						}
					}
					return WILDERNESS_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : MORYTANIA_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : MORYTANIA_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + MORYTANIA_AREA.get(0).name;
						}
					}
					return MORYTANIA_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : TIRANNWN_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : TIRANNWN_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + TIRANNWN_AREA.get(0).name;
						}
					}
					return TIRANNWN_AREA.get(0).name;
				}
			}
			
			for (NamedWorldArea area : FREMENNIK_PROVINCE_AREA) {
				if (area.contains(normalizedPoint)) {
					for (NamedWorldArea zone : FREMENNIK_PROVINCE_ZONE_LIST) {
						if (zone.contains(normalizedPoint)) {
							return zone.name + ", " + FREMENNIK_PROVINCE_AREA.get(0).name;
						}
					}
					return FREMENNIK_PROVINCE_AREA.get(0).name;
				}
			}
			return GIELINOR_SURFACE.name;
		} else if (UNDERGROUND_INSTANCED.contains(point)) {
			return UNDERGROUND_INSTANCED.name;
		} else {
			return "Unknown";
		}
    }

	/**
	 * Formats a list of NamedWorldArea objects as a WorldArea array declaration, suitable for pasting in https://explv.github.io/.
	 */
	public static String toString(List<NamedWorldArea> list) {
		if (list == null || list.isEmpty()) {
			return "WorldArea[] area = {};";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("WorldArea[] area = {\n");

		for (int i = 0; i < list.size(); i++) {
			NamedWorldArea area = list.get(i);
			sb.append("    new WorldArea(")
				.append(area.getX()).append(", ")
				.append(area.getY()).append(", ")
				.append(area.getWidth()).append(", ")
				.append(area.getHeight()).append(", ")
				.append(area.getPlane()).append(")");

			if (i < list.size() - 1) {
				sb.append(",");
			}
			sb.append("\n");
		}

		sb.append("};");
		return sb.toString();
	}
}

