package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WeatherAppGui extends JFrame {

	public WeatherAppGui() {
		super("Weather App");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 650);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);

		addGuiComponents();
	}

	private void addGuiComponents() {
		JTextField searchTextField = new JTextField();
		searchTextField.setBounds(15, 15, 351, 45);
		searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
		add(searchTextField);

		JButton searchButton = new JButton(loadImage("src/main/resources/assets/search.png"));
		searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchButton.setBounds(375, 13, 47, 45);
		add(searchButton);

		JLabel weatherConditionImage = new JLabel(loadImage("src/main/resources/assets/cloud.png"));
		weatherConditionImage.setBounds(0, 125, 450, 217);
		add(weatherConditionImage);

		JLabel temperatureText = new JLabel("10 C");
		temperatureText.setBounds(0, 350, 450, 54);
		temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
		temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
		add(temperatureText);

		JLabel weaterConditionDesc = new JLabel("Cloudy");
		weaterConditionDesc.setBounds(0, 405, 450, 36);
		weaterConditionDesc.setFont(new Font("Dialog", Font.PLAIN, 32));
		weaterConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
		add(weaterConditionDesc);

		JLabel humidityImage = new JLabel(loadImage("src/main/resources/assets/water-drop.png"));
		humidityImage.setBounds(15, 500, 74, 66);
		humidityImage.setFont(new Font("Dialog", Font.PLAIN, 32));
		add(humidityImage);

		JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
		humidityText.setBounds(90, 500, 85, 55);
		humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
		add(humidityText);

		JLabel windSpeedImage = new JLabel(loadImage("src/main/resources/assets/wind.png"));
		windSpeedImage.setBounds(220, 500, 74, 66);
		add(windSpeedImage);

		JLabel windSpeedText = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
		windSpeedText.setBounds(310, 500, 85, 55);
		windSpeedText.setFont(new Font("Dialog", Font.PLAIN, 16));
		add(windSpeedText);
	}

	private ImageIcon loadImage(String resourcePath) {
		try {
			BufferedImage image = ImageIO.read(new File(resourcePath));
			return new ImageIcon(image);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("Could not find resource");
		return null;
	}

}
