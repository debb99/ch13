package com.debashish.poker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PokerFrame extends JFrame{
	class testListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			area.setText("");
			area.setFont(new Font("Courier New", Font.BOLD, 13));
			try
			{
			   FileReader reader = new FileReader("Cards.txt");
			   Scanner file = new Scanner(reader);
			   int handNumber = 0;
			   while(file.hasNextInt( ))
			   {
				   Card temp = new Card(file.nextInt(), file.nextInt());
				   area.append(temp.getCardID() + "\n");
			   }
			   file.close( );
			}
			catch (FileNotFoundException e)
			{
			   area.append(" Error processing file: " + e);
			}
		}
		
	}
	
	class simListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

		}
		
	}
	
	public PokerFrame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Dimension size = new Dimension(800, 400);
		setSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setResizable(false);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		northPanel = new JPanel();
		centerPanel = new JPanel();
		testButton = new JButton("Poker Test");
		testButton.addActionListener(new testListener());
		simButton = new JButton("Poker Simulation");
		simButton.addActionListener(new simListener());
		area = new JTextArea();
		//left-justify this thing
		
		northPanel.add(testButton);
		northPanel.add(simButton);
		
		centerPanel.setBackground(Color.WHITE);
		centerPanel.add(area);
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		pack();
	}
	
	private JPanel northPanel;
	private JPanel centerPanel;
	private JButton testButton;
	private JButton simButton;
	private JTextArea area;
}
