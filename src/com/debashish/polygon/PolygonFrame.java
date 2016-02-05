package com.debashish.polygon;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PolygonFrame extends JFrame {
	public PolygonFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		setResizable(false);
		polyPanel = new PolygonPanel();
		add(polyPanel, BorderLayout.CENTER);
		createControlPanel();
	}

	public void createControlPanel() {
		JPanel controlPanel = new JPanel();
		JLabel numSides = new JLabel("Number of Sides = ");
		JLabel sideLength = new JLabel("Side Length = ");
		JTextField numSidesInput = new JTextField(4);
		JTextField sideLengthInput = new JTextField(4);
		JButton drawButton = new JButton("Draw");

		class DrawListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					polyPanel.setPolygonData(Integer.parseInt(numSidesInput.getText()),
							Double.parseDouble(sideLengthInput.getText()));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(polyPanel, "Please enter valid numbers.", "Invalid input",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		drawButton.addActionListener(new DrawListener());

		controlPanel.add(numSides);
		controlPanel.add(numSidesInput);

		controlPanel.add(sideLength);
		controlPanel.add(sideLengthInput);

		controlPanel.add(drawButton);

		add(controlPanel, BorderLayout.NORTH);
	}

	private PolygonPanel polyPanel;
}
