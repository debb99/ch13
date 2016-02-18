package com.debashish.bars;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class BarChart {
	public void add(double value) {
		data.add(value);
	}

	public void draw(Graphics2D g2, double width, double height, double maximum) {
		// draw the bar chart
		// a gap of 5 pixel is at top of highest bar and below bottom-most line
		double yGap = 5;

		double barWidth = width / (data.size() * 2);

		for (int i = 0; i < data.size(); i++) {
			double barHeight = height * (data.get(i) / maximum) - yGap;
			g2.drawRect((int) barWidth / 2 + (int) (barWidth * i * 2), (int)(height - barHeight), (int) barWidth,
					(int) (barHeight - yGap));
			g2.drawString(data.get(i).toString(), (int) (barWidth / 2 + (barWidth * i * 2) + barWidth + 5), (int)(height - barHeight + 10));
		}

		g2.draw(new Line2D.Double(0, height - yGap, width, height - yGap));
	}

	ArrayList<Double> data = new ArrayList<>();
}