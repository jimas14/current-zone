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

	public static final List<NamedWorldArea> MISTHALIN_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> MISTHALIN_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> KHARIDIAN_DESERT_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> KHARIDIAN_DESERT_ZONE_LIST = new ArrayList<>();

	public static final List<NamedWorldArea> ASGARNIA_AREA = new ArrayList<>();
	public static final List<NamedWorldArea> ASGARNIA_ZONE_LIST = new ArrayList<>();

    public static final List<NamedWorldArea> KANDARIN_AREA = new ArrayList<>();
    public static final List<NamedWorldArea> KANDARIN_ZONE_LIST = new ArrayList<>();

    /*
     * List of all Areas (Kingdoms, Oceans, etc.) and Zones (Cities/towns, Seas, etc.)
     */
	static {
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
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2980, 3104, 50, 417, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2944, 3191, 36, 118, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2916, 3195, 28, 114, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 3030, 3190, 22, 89, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 3052, 3245, 14, 42, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 3030, 3257, 38, 264, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2909, 3309, 71, 211, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2893, 3292, 23, 228, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2790, 3494, 103, 26, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2795, 3520, 141, 60, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2787, 3536, 8, 8, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2878, 3382, 15, 112, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2828, 3485, 50, 9, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2832, 3473, 46, 12, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2835, 3463, 43, 10, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2842, 3447, 36, 16, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2867, 3428, 11, 19, 0));
        ASGARNIA_AREA.add(new NamedWorldArea("Kingdom of Asgarnia", 2853, 3436, 14, 11, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Monastery", 3040, 3467, 23, 53, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Dwarven Mine", 2999, 3440, 31, 19, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Black Knights' Fortress", 3004, 3508, 29, 15, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Black Knights' Fortress", 3023, 3500, 10, 23, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Goblin Village", 2944, 3477, 24, 41, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Ice Mountain", 2997, 3459, 26, 49, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Mining Guild", 3008, 3331, 21, 19, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("South Falador Farm", 3012, 3280, 56, 34, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Falador", 2936, 3308, 130, 89, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Port Sarim", 3008, 3177, 55, 89, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Monastery", 3040, 3467, 23, 53, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Dark Wizards' Tower", 2900, 3328, 16, 15, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Crafting Guild", 2913, 3266, 33, 31, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Rimmington", 2943, 3196, 48, 69, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Rimmington", 2903, 3196, 40, 39, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Mudksipper Point", 2983, 3107, 23, 23, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Taverly", 2876, 3404, 67, 72, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Druids' Circle", 2915, 3476, 20, 16, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Chaos Temple", 2929, 3512, 13, 9, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2867, 3427, 9, 43, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2862, 3435, 5, 35, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2855, 3438, 7, 32, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2850, 3443, 5, 28, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2844, 3446, 6, 26, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2841, 3449, 3, 24, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2833, 3470, 41, 60, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2793, 3493, 40, 45, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("White Wolf Mountain", 2874, 3496, 5, 28, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Warriors' Guild", 2833, 3530, 47, 30, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Heroes' Guild", 2881, 3502, 24, 18, 0));
        ASGARNIA_ZONE_LIST.add(new NamedWorldArea("Burthorpe", 2880, 3525, 55, 55, 0));

        // Kandarin Area & Zones
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2450, 3071, 235, 517, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2364, 3364, 86, 190, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2291, 3458, 73, 254, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2261, 3527, 30, 138, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2364, 3554, 42, 84, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2426, 3071, 24, 144, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2363, 3041, 82, 100, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2322, 3036, 41, 42, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2345, 3030, 97, 11, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2559, 3044, 66, 27, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2512, 3588, 33, 8, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2641, 3588, 32, 4, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2650, 3592, 23, 3, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2656, 3595, 21, 4, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2685, 3264, 101, 307, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2786, 3273, 10, 17, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2786, 3409, 81, 23, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2786, 3432, 44, 56, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2806, 3488, 20, 6, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2830, 3432, 10, 29, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2840, 3432, 16, 14, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2856, 3432, 8, 6, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2830, 3461, 4, 14, 0));
        KANDARIN_AREA.add(new NamedWorldArea("Kingdon of Kandarin", 2785, 3488, 4, 32, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2847, 3427, 14, 10, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2837, 3416, 12, 12, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2839, 3437, 14, 5, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2839, 3430, 8, 17, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2791, 3432, 48, 26, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2803, 3432, 21, 43, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2802, 3410, 4, 22, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Catherby", 2790, 3412, 16, 5, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Camelot Castle", 2743, 3481, 33, 38, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Camelot Castle", 2776, 3504, 2, 15, 0));
        KANDARIN_ZONE_LIST.add(new NamedWorldArea("Camelot Castle", 2778, 3511, 7, 8, 0));
	}

    public static String getZoneName(WorldPoint point) {
		// Always use plane 0 so upstairs areas are still registered
		WorldPoint normalizedPoint = new WorldPoint(point.getX(), point.getY(), 0);

        // Regions are split by Gielinor Surface and all underground zones/instanced areas.
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

