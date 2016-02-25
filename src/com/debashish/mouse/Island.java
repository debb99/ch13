package com.debashish.mouse;

import java.util.Random;

public class Island {
	public enum Status{
		SEARCHING,
		ESCAPED,
		DROWNED,
		STARVED
	}
	
	public Island() {
		gen = new Random();
	}
	
	public int[][] createIsland(){
		//need a 2D array var over here, that's why this is confusing
		int[][] array = new int[10][15];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(i == 0 || i == array.length - 1 || j == 0 || j == array[i].length - 1){
					if(gen.nextInt(100) < PERCENT_BRIDGES){
						array[i][j] = -1;
					} else {
						array[i][j] = 0;
					}
				}
			}
		}
		
		x = array[0].length / 2;
		y = array.length / 2;
		
		return array;
	}
	
	public void printIsland(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%6d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public Status moveAbout(){
		Status status = Status.SEARCHING;
		for(int i = 0; i < 50; i++){
			
		}
		
		return status;
	}
	
	public void simulate(){
		
	}
	
	private int[][] Island;
	private int y;
	private int x;
	private Random gen;
	private final int PERCENT_BRIDGES = 50;
}
