package com.debashish.reverse;

import java.util.Random;
import java.util.Scanner;

public class ReverseTest2 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Random gen = new Random();

		System.out.print("How many array elements? : ");
		int amountOfElements = myScanner.nextInt();
		System.out.println("This array of length " + amountOfElements + " will be filled with random two-digit integers.\n");
		int[] origArray = new int[amountOfElements];
		for(int i = 0; i < amountOfElements; i++){
			origArray[i] = gen.nextInt(89) + 10;
		}
		
		System.out.println("ORIGINAL ARRAY: ");
		for(int k = 0; k < origArray.length; k++){
			System.out.printf("\tarray[%d] = %d\n", k, origArray[k]);
		}
		
		reverse(origArray);
	
		System.out.println();
		
		System.out.println("REVERSED ARRAY: ");
		for(int j = 0; j < origArray.length; j++){
			System.out.printf("\tarray[%d] = %d\n", j, origArray[j]);
		}
	}

	/**
	 * compute the reverse of an array
	 * 
	 * @param array
	 *            an array of integer values
	 * @return a copy of the array, with the elements reversed
	 */
	public static void reverse(int[] array) {
		int len = array.length;
		int[] newArray = new int[len];

		for (int i = 0; i < len; i++)
			newArray[len - i - 1] = array[i];
		
		for(int j = 0; j < len; j++){
			array[j] = newArray[j];
		}
	}

}
