package com.debashish.circles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class CirclesPanel extends JPanel {
	public CirclesPanel() {
		generator = new Random();
		setBackground(Color.white);
	}

	public void constructCircles() {
		circles = new ArrayList<>();
		int max = 60;
		int min = 10;
		int rejectCount = 0;
		// fill circles array list with 250 circles that don't intersect
		while (circles.size() < 250) {
			int r = generator.nextInt(max - min) + min;
			Ellipse2D.Double tempCircle = new Ellipse2D.Double(generator.nextInt(getWidth() - r),
					generator.nextInt(getHeight() - r), r, r);

			boolean rejected = false;
			for (Ellipse2D.Double c : circles) {
				if (circlesIntersect(c, tempCircle)) {
					rejected = true;
				}
			}

			if (!rejected) {
				circles.add(tempCircle);
			} else rejectCount++;
		}
		System.out.println("Circles rejected: " + rejectCount);
		System.out.printf("\t(%.3f%% of the circles passed.)\n\n", 100 * 250 / (float)rejectCount);
	}

	/**
	 * Test if two circles intersect (distance between centers is less than sum
	 * of radii)
	 * 
	 * @param c1
	 *            the first circle
	 * @param c2
	 *            the second circle
	 */
	public boolean circlesIntersect(Ellipse2D.Double c1, Ellipse2D.Double c2) {
		double radius1 = c1.getWidth() / 2;
		double radius2 = c2.getWidth() / 2;
		double dx = (c1.x + radius1) - (c2.x + radius2);
		double dy = (c1.y + radius1) - (c2.y + radius2);
		double distance = Math.sqrt(dx * dx + dy * dy);
		return distance < radius1 + radius2;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		constructCircles();
		for (Ellipse2D.Double c : circles) {
			g2.draw(c);
		}
		System.gc();
	}

	private ArrayList<Ellipse2D.Double> circles;
	private Random generator;
}
