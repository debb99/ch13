package com.debashish.mouse;

public class MouseTest {
	public static void main(String[] args) {
		Island Game = new Island();
		
		int[] values = new int[4];
		for(int a : values){
			a = 0;
		}
		
		//1 = ESC
		//2 = DROWN
		//3 = STARVED
		
		for(int i = 0; i < 1000; i++){
			Island.Status tempStatus = Game.simulate();
			if(tempStatus == Island.Status.ESCAPED){
				values[1]++;
			}
			
			if(tempStatus == Island.Status.DROWNED){
				values[2]++;
			}

			if(tempStatus == Island.Status.STARVED){
				values[3]++;
			}
		}
		
		System.out.printf("Escaped: %d%nDrowned: %d%nStarved: %d%n", values[1], values[2], values[3]);
	}
}
