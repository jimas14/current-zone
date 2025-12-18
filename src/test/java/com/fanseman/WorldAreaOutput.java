package com.fanseman;

import java.util.List;

/**
 * Outputs all areas and zones as a WorldArea array declaration, suitable for pasting in https://explv.github.io/.
 */
public class WorldAreaOutput {
	public static void main(String[] args) {
        outputList(ZoneDetector.MISTHALIN_AREA, "Misthalin Area");
		outputList(ZoneDetector.MISTHALIN_ZONE_LIST, "Misthalin Zones");
		outputList(ZoneDetector.KHARIDIAN_DESERT_AREA, "Kharidian Desert Area");
		outputList(ZoneDetector.KHARIDIAN_DESERT_ZONE_LIST, "Kharidian Desert Zones");
		outputList(ZoneDetector.ASGARNIA_AREA, "Asgarnia Area");
		outputList(ZoneDetector.ASGARNIA_ZONE_LIST, "Asgarnia Zones");
		outputList(ZoneDetector.KANDARIN_AREA, "Kandarin Area");
		outputList(ZoneDetector.KANDARIN_ZONE_LIST, "Kandarin Zones");
	}

	private static void outputList(List<ZoneDetector.NamedWorldArea> list, String area) {
		if (list != null && !list.isEmpty()) {
			System.out.println("// " + area);
			System.out.println(ZoneDetector.toString(list));
			System.out.println();
		}
	}
}

