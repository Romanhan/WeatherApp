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
import javax.swing.JTextField;

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