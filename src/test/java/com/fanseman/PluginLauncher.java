package com.fanseman;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginLauncher {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(CurrentZonePlugin.class);
		RuneLite.main(args);
	}
}