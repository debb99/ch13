package com.debashish.bars;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class BarChartPanel extends JPanel {
	public BarChartPanel() {
		setBackground(Color.WHITE);
		int FINAL_WIDTH = 600;
		int FINAL_HEIGHT = 600;

		bChart = new BarChart();

		setPreferredSize(new Dimension(FINAL_WIDTH, FINAL_HEIGHT));
		PANEL_WIDTH = FINAL_WIDTH;
		PANEL_HEIGHT = FINAL_HEIGHT;
	}

	public void newBar(double aHeight) {
		bChart.add(aHeight);
		if(aHeight > max){
			max = aHeight;
		}
		
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		bChart.draw(g2, getWidth(), getHeight(), max);
	}

	private int numBars;
	private BarChart bChart;
	private double max = 0;
	private final int PANEL_WIDTH;
	private final int PANEL_HEIGHT;
}
