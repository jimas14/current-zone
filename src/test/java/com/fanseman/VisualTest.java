package com.fanseman;

import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Proxy;

/**
 * Visual test window to preview the center screen overlay animation and minimap overlay.
 * Run this class's main method to see the animations in action.
 */
public class VisualTest extends JFrame {
	private final Client mockClient;
	private final MockPluginConfig mockPluginConfig;
	private final CenterOverlay centerOverlay;
	private final MinimapOverlay minimapOverlay;
	private final RenderPanel renderPanel;
	private Timer animationTimer;
	
	private String currentZone = "";
	private JTextField xField;
	private JTextField yField;
	private JTextField zField;

	public VisualTest() {
		setTitle("Visual Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);

		// Create mock client & config
		mockClient = createMockClient(800, 600);
		mockPluginConfig = new MockPluginConfig();

		// Create overlays using test constructors
		centerOverlay = new CenterOverlay(mockClient, mockPluginConfig, true);
		minimapOverlay = new MinimapOverlay(mockClient, mockPluginConfig, true);

		// Create render panel
		renderPanel = new RenderPanel();
		add(renderPanel, BorderLayout.CENTER);

		// Create control panel
		JPanel controlPanel = new JPanel(new FlowLayout());
		
		// X/Y/Z coordinate input fields
		controlPanel.add(new JLabel("X:"));
		xField = new JTextField("3235", 6);
		xField.addActionListener(e -> updateLocationFromFields());
		controlPanel.add(xField);
		
		controlPanel.add(new JLabel("Y:"));
		yField = new JTextField("3218", 6);
		yField.addActionListener(e -> updateLocationFromFields());
		controlPanel.add(yField);
		
		controlPanel.add(new JLabel("Z:"));
		zField = new JTextField("0", 4);
		zField.addActionListener(e -> updateLocationFromFields());
		controlPanel.add(zField);
		
		JButton lumbridgeExample = new JButton("Lumbridge");
		lumbridgeExample.addActionListener(e -> setLocation(3235, 3218, 0));
		controlPanel.add(lumbridgeExample);

		JButton varrockExample = new JButton("Varrock");
		varrockExample.addActionListener(e -> setLocation(3214, 3423, 0));
		controlPanel.add(varrockExample);

		JButton faladorExample = new JButton("Falador");
		faladorExample.addActionListener(e -> setLocation(2960, 3360, 0));
		controlPanel.add(faladorExample);

		JButton autoCycle = new JButton("Auto Cycle");
		autoCycle.addActionListener(e -> startAutoCycle());
		controlPanel.add(autoCycle);

		add(controlPanel, BorderLayout.SOUTH);

		// Start render timer (60 FPS) -- animation is time-based, so we need to repaint regularly
		Timer renderTimer = new Timer(16, e -> renderPanel.repaint());
		renderTimer.start();

        // Initialize location
		setLocation(3235, 3218, 0);
	}

	private void updateLocationFromFields() {
		try {
			int x = Integer.parseInt(xField.getText());
			int y = Integer.parseInt(yField.getText());
			int z = Integer.parseInt(zField.getText());
			setLocation(x, y, z);
		} catch (NumberFormatException e) {
			// Invalid input, ignore
		}
	}

	private void setLocation(int x, int y, int plane) {
		// Update text fields to reflect current values
		xField.setText(String.valueOf(x));
		yField.setText(String.valueOf(y));
		zField.setText(String.valueOf(plane));
		
		WorldPoint location = new WorldPoint(x, y, plane);
		String newZone = ZoneDetector.getZoneName(location);

		minimapOverlay.setCurrentZone(newZone);

		if (!newZone.equals(currentZone)) {
			currentZone = newZone;
			centerOverlay.startAnimation(newZone);
		}

		renderPanel.repaint();
	}

	private void startAutoCycle() {
		if (animationTimer != null && animationTimer.isRunning()) {
			animationTimer.stop();
			return;
		}

		// Test locations that will trigger zone changes
		WorldPoint[] locations = {
			new WorldPoint(3200, 3200, 0), // Lumbridge
			new WorldPoint(3210, 3370, 0), // Varrock
			new WorldPoint(2960, 3360, 0), // Falador
			new WorldPoint(3090, 3500, 0), // Edgeville
			new WorldPoint(3160, 3480, 0), // Grand Exchange
			new WorldPoint(3280, 3170, 0), // Al Kharid
			new WorldPoint(2700, 3480, 0), // Seers' Village
			new WorldPoint(2750, 3480, 0)  // Camelot
		};

		final int[] currentIndex = {0};
		animationTimer = new Timer(16000, e -> { // 16 seconds per zone (full animation cycle ~15s + buffer)
			WorldPoint loc = locations[currentIndex[0]];
			setLocation(loc.getX(), loc.getY(), loc.getPlane());
			currentIndex[0] = (currentIndex[0] + 1) % locations.length;
		});
		animationTimer.setInitialDelay(0);
		animationTimer.start();
		setLocation(locations[0].getX(), locations[0].getY(), locations[0].getPlane());
	}

	private class RenderPanel extends JPanel {
		public RenderPanel() {
			setBackground(new Color(20, 20, 20)); // Dark background to simulate game
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			// Create graphics for rendering
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			
			// Set font to RuneScape font (or fallback to default)
			Font runeliteFont = FontLoader.getRuneScapeFont(12f, Font.PLAIN);
			g2d.setFont(runeliteFont);

			// Render minimap overlay (always visible)
			minimapOverlay.render(g2d);
			
			// Render center overlay (only when zone changes)
			centerOverlay.render(g2d);

			g2d.dispose();
		}
	}

	/**
	 * Mock PluginConfig
	 */
	private static class MockPluginConfig implements PluginConfig {
		@Override
		public boolean showZoneOnMinimap() {
			return true;
		}

		@Override
		public boolean showCenterOverlay() {
			return true;
		}

		@Override
		public Color zoneTextColor() {
			return Color.WHITE;
		}

		@Override
		public Color zoneBackgroundColor() {
			return Color.BLACK;
		}
	}

	/**
	 * Mock RuneLite client
	 */
	private static Client createMockClient(int width, int height) {
		Canvas mockCanvas = new Canvas() {
			@Override
			public Dimension getSize() {
				return new Dimension(width, height);
			}
		};

		return (Client) Proxy.newProxyInstance(
			Client.class.getClassLoader(),
			new Class[]{Client.class},
			(proxy, method, args) -> {
				String methodName = method.getName();

				if (methodName.equals("getCanvas")) {
					return mockCanvas;
				}

				if (methodName.equals("isResized")) {
					return false;
				}

				if (methodName.equals("getLocalPlayer")) {
					// Return null to match MinimapOverlay's null check behavior
					// The overlay will still render because we're in test mode
					return null;
				}

				// Return default values for other methods
				if (method.getReturnType().isPrimitive()) {
					if (method.getReturnType() == boolean.class) {
						return false;
					} else if (method.getReturnType() == int.class) {
						return 0;
					} else if (method.getReturnType() == long.class) {
						return 0L;
					} else if (method.getReturnType() == float.class) {
						return 0.0f;
					} else if (method.getReturnType() == double.class) {
						return 0.0;
					}
				}
				return null;
			}
		);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				e.printStackTrace();
			}

			VisualTest test = new VisualTest();
			test.setVisible(true);
		});
	}
}
