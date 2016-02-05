package com.debashish.polygon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

public class PolygonPanel extends JPanel {
	public PolygonPanel() {
		setBackground(Color.WHITE);
		int FINAL_WIDTH = 600;
		int FINAL_HEIGHT = 600;

		setPreferredSize(new Dimension(FINAL_WIDTH, FINAL_HEIGHT));
		PANEL_WIDTH = FINAL_WIDTH;
		PANEL_HEIGHT = FINAL_HEIGHT;
	}

	public void setPolygonData(int nSides, double sLength) {
		numSides = nSides;
		sideLength = sLength;

		constructPoly();

		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));

//		g2.draw(new Line2D.Double(0, PANEL_HEIGHT / 2, PANEL_WIDTH, PANEL_HEIGHT / 2));
//		g2.draw(new Line2D.Double(PANEL_WIDTH / 2, 0, PANEL_WIDTH / 2, PANEL_HEIGHT));

		if (poly != null) {
			poly.draw(g2);
		}
	}

	public void constructPoly() {
		poly = new Polygon();
		boolean oddSides = (numSides % 2 != 0);
		double step = (Math.PI * 2) / numSides;
		
		double NINETY = Math.PI / 2;
		
		if(oddSides){
			for (double i = 0; i <= Math.PI * 2; i += step) {
				Point2D.Double myPoint = new Point2D.Double(sideLength * Math.cos(i - NINETY) + PANEL_WIDTH / 2,
						sideLength * Math.sin(i - NINETY) + PANEL_HEIGHT / 2);
				poly.add(myPoint);
			}			
		} else {
			for (double i = 0; i <= Math.PI * 2; i += step) {
				Point2D.Double myPoint = new Point2D.Double(sideLength * Math.cos(i - NINETY / 2) + PANEL_WIDTH / 2,
						sideLength * Math.sin(i - NINETY / 2) + PANEL_HEIGHT / 2);
				poly.add(myPoint);
			}	
		}
	}

	private int numSides;
	private double sideLength;
	private Polygon poly;

	private final int PANEL_WIDTH;
	private final int PANEL_HEIGHT;
}
