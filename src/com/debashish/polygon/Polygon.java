package com.debashish.polygon;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.jws.Oneway;

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
		
	}
	
	//calculate the perimeter of a polygon using distance method
	public double perimeter(){
		
	}
	
	//helper method to calculate the distance between two points
	public static double distance(Point2D.Double p, Point2D.Double q){
		
	}
	
	//calculate the area of a polygon
	public double area(){
		
	}
	
	ArrayList<Point2D.Double> points;
}
