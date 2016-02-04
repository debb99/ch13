package com.debashish.polygon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PolygonFrame extends JFrame {
	public PolygonFrame(String title) {
		super(title);
		setSize(new Dimension(600, 600));
		setLayout(new BorderLayout());

		polyPanel = new PolygonPanel();
		add(polyPanel);

		createControlPanel();
	}

	public void createControlPanel() {
		JPanel controlPanel = new JPanel();
		JLabel numSides = new JLabel("# Sides = ");
		JLabel sideLength = new JLabel("Side Length");
		JTextField numSidesInput = new JTextField(5);
		JTextField sideLengthInput = new JTextField(5);
		JButton drawButton = new JButton("Draw");

		class DrawListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(numSidesInput.getText() == null || sideLengthInput.getText() == null){
					//JOptionPane.showMessage
				}
				
				polyPanel.setPolygonData(Integer.parseInt(numSidesInput.getText()),
						Double.parseDouble(sideLengthInput.getText()));
			}
		}

		controlPanel.add(numSides);
		controlPanel.add(numSidesInput);

		controlPanel.add(sideLength);
		controlPanel.add(sideLengthInput);

		controlPanel.add(drawButton);

		add(controlPanel, BorderLayout.NORTH);
	}

	private PolygonPanel polyPanel;
}
