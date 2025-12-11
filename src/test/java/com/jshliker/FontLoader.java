package com.jshliker;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

/**
 * Utility class to load custom fonts from resources.
 */
public class FontLoader {
	private static Font runescapeFont = null;
	
	/**
	 * Loads the RuneScape UF font from resources.
	 * @return The loaded font, or null if loading failed
	 */
	public static Font loadRuneScapeFont() {
		if (runescapeFont != null) {
			return runescapeFont;
		}
		
		try {
			// Load font from resources
			InputStream fontStream = FontLoader.class.getResourceAsStream("/runescape_uf.ttf");
			if (fontStream == null) {
				// Font file not found, return null to use default font
				return null;
			}
			
			// Create font from stream
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
			fontStream.close();
			
			// Register font with graphics environment
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(font);
			
			runescapeFont = font;
			return font;
		} catch (FontFormatException | IOException e) {
			// If font loading fails, return null to use default font
			return null;
		}
	}
	
	/**
	 * Gets the RuneScape font with the specified size and style.
	 * Falls back to default font if RuneScape font is not available.
	 * @param size Font size
	 * @param style Font style (Font.PLAIN, Font.BOLD, etc.)
	 * @return The font, or a default font if RuneScape font is not available
	 */
	public static Font getRuneScapeFont(float size, int style) {
		Font font = loadRuneScapeFont();
		if (font != null) {
			return font.deriveFont(style, size);
		}
		// Fallback to default font
		return new Font(Font.SANS_SERIF, style, (int) size);
	}
}

