package com.debashish.arraysubscripts;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Random gen = new Random();
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("How many numbers do you want to generate? : ");
			int amountOfNumbers = myScanner.nextInt();
		System.out.print("How many outcomes do you want to test for? : ");
			int outcomes = myScanner.nextInt();
		System.out.println();
		System.out.printf("Testing %d passes for %d outcomes...\n", amountOfNumbers, outcomes);
		
		myScanner.close();
		
		int[] Results = new int[outcomes];
		for(int i : Results){
			i = 0;
		}
		for(int k = 0; k < amountOfNumbers; k++){
			int temp = gen.nextInt(outcomes);
			Results[temp]++;
		}
		
		for(int j = 0; j < Results.length; j++){
			System.out.printf("Results[%d] = %d\n", j, Results[j]);
		}
		
		Results = null;
		System.gc();
	}
}
