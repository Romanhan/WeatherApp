package launcher;

import javax.swing.SwingUtilities;

import gui.WeatherAppGui;

public class WeatherAppLauncher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WeatherAppGui().setVisible(true);
			}
		});
	}
}
