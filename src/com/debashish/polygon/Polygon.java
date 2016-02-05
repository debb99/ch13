package com.debashish.polygon;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Polygon {
	public Polygon() {
		points = new ArrayList<>();
	}
	
	//adds a point of the polygon
	public void add(Point2D.Double aPoint){
		points.add(aPoint);
	}
	
	//draws the polygon
	public void draw(Graphics2D g2){
		for(int i = 1; i < points.size(); i++){
			g2.draw(new Line2D.Double(points.get(i - 1), points.get(i)));
		}
	}
	
	//calculate the perimeter of a polygon using distance method
	public double perimeter(){
		return 0;
	}
	
	//helper method to calculate the distance between two points
	public static double distance(Point2D.Double p, Point2D.Double q){
		return 0;
	}
	
	//calculate the area of a polygon
	public double area(){
		//Area of a regular polygon = (1/2) N sin(360°/N) (s^2)
		return 0;
	}
	
	ArrayList<Point2D.Double> points;
}
