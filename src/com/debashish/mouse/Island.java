package com.debashish.mouse;

import java.util.Random;

public class Island {
	public enum Status {
		SEARCHING, ESCAPED, DROWNED, STARVED
	}

	public Island() {
		gen = new Random();
	}

	public int[][] createIsland() {
		int[][] array = new int[10][15];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 || i == array.length - 1 || j == 0 || j == array[i].length - 1) {
					if (gen.nextInt(100) < PERCENT_BRIDGES) {
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

	public void printIsland(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					System.out.printf("%6s", arr[i][j] == -1 ? "W" : "B");
				} else {
					System.out.printf("%6d", arr[i][j]);
				}
					
			}
			System.out.println();
		}
	}

	public int moveAbout() {
		Status status = Status.SEARCHING;
		
		int i = 0;
		int numpass = 50;
		
		for (i = 0; i < numpass; i++) {
			switch (gen.nextInt(4)) {
			case 0:
				y--;
				break;
			case 1:
				x++;
				break;
			case 2:
				y++;
				break;
			case 3:
				x--;
				break;
			default:
				break;
			}
			
			if(y == 0 || y == Island.length - 1 || x == 0 || x == Island[y].length - 1){
				switch(Island[y][x]){
				case 0:
					status = Status.ESCAPED;
					break;
				case -1:
					status = Status.DROWNED;
					break;
				}
				break;
			}

			Island[y][x] = i;
		}
		
		if(i >= numpass){
			status = Status.STARVED;
		}
		
		finalStatus = status;

		return i;
	}

	public Status simulate() {
		Island = createIsland();
		
		int turn = moveAbout();
		printIsland(Island);
		
		String indent = "\t\t\t";
		
		if(finalStatus == Status.ESCAPED){
			System.out.println(indent + "The mouse has escaped on turn " + turn);
		} else if(finalStatus == Status.DROWNED){
			System.out.println(indent + "The mouse unfortunately drowned on turn " + turn);
		} else if (finalStatus == Status.STARVED){
			System.out.println(indent + "The mouse has run out of food, starving on turn " + turn);
		}
		
		System.out.println("\n");
		
		return finalStatus;
	}

	Status finalStatus;
	private int[][] Island;
	private int y;
	private int x;
	private Random gen;
	private final int PERCENT_BRIDGES = 30;
}
