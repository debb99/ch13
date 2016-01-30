package com.debashish.sora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CloudFrame extends JFrame {
	public CloudFrame(String name) {
		super(name);
		setLayout(new BorderLayout());

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		buttonPanel = new JPanel();
		displayPanel = new CloudPanel();

		class ButtonListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayPanel.draw();
			};
		}

		JButton drawButton = new JButton("Draw");
		buttonPanel.add(drawButton);
		buttonPanel.setBackground(Color.WHITE);
		drawButton.addActionListener(new ButtonListener());

		add(buttonPanel, BorderLayout.NORTH);
		add(displayPanel, BorderLayout.CENTER);

		pack();
	}

	private JPanel buttonPanel;
	private CloudPanel displayPanel;
}
