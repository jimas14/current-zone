package com.fanseman;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Prompts the user for zone/area information and converts WorldArea[] input to NamedWorldArea.add() format.
 */
public class WorldAreaInput {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Variable name? ");
			String variableName = reader.readLine().trim();
			
			System.out.print("Pretty name? ");
			String prettyName = reader.readLine().trim();
			
			System.out.println("\nWorldArea list: (paste the WorldArea[] block, then press Enter)");
			StringBuilder worldAreaInput = new StringBuilder();
			String line;
			boolean hasContent = false;
			
			// Read until we find }; or end of stream or empty line after content
			while ((line = reader.readLine()) != null) {
				String trimmed = line.trim();
				worldAreaInput.append(line).append("\n");
				
				if (!trimmed.isEmpty()) {
					hasContent = true;
				}
				
				// Stop reading when we encounter the closing brace and semicolon
				if (trimmed.equals("};") || trimmed.endsWith("};")) {
					break;
				}
				
				// Also stop if we get an empty line after having content (allows paste + Enter)
				if (trimmed.isEmpty() && hasContent && worldAreaInput.toString().contains("new WorldArea")) {
					break;
				}
			}
			
			// Parse the WorldArea[] input
			List<WorldAreaData> areas = parseWorldAreaInput(worldAreaInput.toString());
			
			if (areas.isEmpty()) {
				System.err.println("Warning: No WorldArea entries found in input.");
				System.err.println("Input received: " + worldAreaInput.toString());
			}
			
			// Generate output
			for (WorldAreaData area : areas) {
				System.out.println(variableName + ".add(new NamedWorldArea(\"" + prettyName + "\", " +
					area.x + ", " + area.y + ", " + area.width + ", " + area.height + ", " + area.plane + "));");
			}
		} catch (Exception e) {
			System.err.println("Error reading input: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Parses WorldArea[] input and extracts WorldArea data.
	 * Expected format: new WorldArea(x, y, width, height, plane)
	 */
	private static List<WorldAreaData> parseWorldAreaInput(String input) {
		List<WorldAreaData> areas = new ArrayList<>();
		
		// Pattern to match: new WorldArea(x, y, width, height, plane)
		Pattern pattern = Pattern.compile("new WorldArea\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+)\\)");
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			int x = Integer.parseInt(matcher.group(1));
			int y = Integer.parseInt(matcher.group(2));
			int width = Integer.parseInt(matcher.group(3));
			int height = Integer.parseInt(matcher.group(4));
			int plane = Integer.parseInt(matcher.group(5));
			
			areas.add(new WorldAreaData(x, y, width, height, plane));
		}
		
		return areas;
	}
	
	/**
	 * Simple data class to hold WorldArea parameters.
	 */
	private static class WorldAreaData {
		final int x;
		final int y;
		final int width;
		final int height;
		final int plane;
		
		WorldAreaData(int x, int y, int width, int height, int plane) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.plane = plane;
		}
	}
}

