package com.debashish.bars;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BarChartPanel extends JPanel {
	public BarChartPanel(){
		setBackground(Color.WHITE);
		int FINAL_WIDTH = 600;
		int FINAL_HEIGHT = 600;

		setPreferredSize(new Dimension(FINAL_WIDTH, FINAL_HEIGHT));
		PANEL_WIDTH = FINAL_WIDTH;
		PANEL_HEIGHT = FINAL_HEIGHT;
	}
	
	public void newBar(double aHeight){
		
	}
	
	public void paintComponent(Graphics g){
		 
	}
	
	private int numBars;
	private BarChart bChart;
	private final int PANEL_WIDTH;
	private final int PANEL_HEIGHT;
}
