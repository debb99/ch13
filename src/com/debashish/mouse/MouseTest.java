package com.debashish.mouse;

import java.util.Random;

public class MouseTest {
	public static void main(String[] args) {
		gen = new Random();
		createIsland();
	}
	
	public static int[][] createIsland(){
		//need a 2D array var over here, that's why this is confusing
		int[] rows = new int[15];
		int[] columns = new int[10];
		
		for(int i = 0; i < columns.length; i++){
			for(int j = 0; j < rows.length; j++){
				if(i == 0 || i == columns.length - 1 || j == 0 || j == rows.length - 1){
					if(gen.nextInt(100) > 30){
						
					} else {
						columns[i][j] = 0;
					}
				}
			}
		}
	}
	
	static Random gen;
	private final int PERCENT_BRIDGES = 30;
}
