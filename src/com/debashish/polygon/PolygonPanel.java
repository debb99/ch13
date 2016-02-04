package com.debashish.polygon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PolygonPanel extends JPanel{
	public PolygonPanel() {
		setBackground(Color.WHITE);
		setSize(new Dimension(400, 400));
		PANEL_WIDTH = getWidth();
		PANEL_HEIGHT = getHeight();
	}
	
	public void setPolygonData(int nSides, double sLength){
		
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.setBackground(Color.WHITE);
	}
	
	public void constructPoly(){
		
	}
	
	private int numSides;
	private double sideLength;
	private Polygon poly;
	
	private final int PANEL_WIDTH;
	private final int PANEL_HEIGHT;
}
