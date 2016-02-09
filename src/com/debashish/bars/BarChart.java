package com.debashish.bars;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class BarChart {
	public void add(double value){
		data.add(value);
	}
	
	public void draw(Graphics2D g2, double width, double height){
		//draw the bar chart
		//a gap of 5 pixel is at top of highest bar and below bottom-most line
	}
	
	ArrayList<Double> data = new ArrayList<>();
}