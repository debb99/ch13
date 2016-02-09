package com.debashish.bars;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.debashish.polygon.PolygonPanel;

public class BarChartFrame extends JFrame {
	public BarChartFrame(String title){
		//constructs frame
		//drawing panel in CENTER
		
		super(title);
		setLayout(new BorderLayout());
		setResizable(false);
		barPanel = new BarChartPanel();
		add(barPanel, BorderLayout.CENTER);
		createControlPanel();
		
		pack();
	}
	
	public void createControlPanel(){
		//creates control panel
		//panel contains label and text field for size of new bar and draw button
		//EtchedBorder around the panel
		
		JPanel controlPanel = new JPanel();
		JLabel heightLabel = new JLabel("Bar Height = ");
		JTextField inputField = new JTextField(4);
		JButton drawButton = new JButton("Add Bar");

		class DrawListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(barPanel, "Please enter a valid number.", "Invalid input",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		drawButton.addActionListener(new DrawListener());

		controlPanel.add(heightLabel);
		controlPanel.add(inputField);
		controlPanel.add(drawButton);

		add(controlPanel, BorderLayout.NORTH);
	}
	
	private BarChartPanel barPanel;
}
