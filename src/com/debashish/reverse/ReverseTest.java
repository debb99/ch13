package com.debashish.reverse;

import java.util.Random;
import java.util.Scanner;

public class ReverseTest {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Random gen = new Random();

		System.out.print("How many array elements? : ");
		int amountOfElements = myScanner.nextInt();
		System.out.println("This array will be filled with random two-digit integers.");
		int[] origArray = new int[amountOfElements];
		for (int i : origArray) {
			i = gen.nextInt(89) + 10;
		}
		
		int[] reverseArray = reverse(origArray);
	}

	/**
	 * compute the reverse of an array
	 * 
	 * @param array
	 *            an array of integer values
	 * @return a copy of the array, with the elements reversed
	 */
	public static int[] reverse(int[] array) {
		int len = array.length;
		int[] newArray = new int[len];

		for (int i = 0; i < len; i++)
			newArray[len - i - 1] = array[i];

		return newArray;
	}

}
