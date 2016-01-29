package com.debashish.twodimensional;

import java.util.Random;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int rows = 4;
		int columns = 5;

		Random gen = new Random();

		int[][] twoDim = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoDim[i][j] = gen.nextInt(89) + 10;
			}
		}

		System.out.println("Table:");
		for (int k[] : twoDim) {
			for (int l : k) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int n = 0; n < twoDim[0].length; n++) {
			System.out.printf("The max for column %d is %d\n", n, getMaxColumn(n, twoDim));
		}
	}

	protected static int getMaxRow(int[] array) {
		int temp = 0;
		for (int i : array) {
			if (i > temp) {
				temp = i;
			}
		}
		return temp;
	}

	protected static int getMaxColumn(int row, int[][] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i][row] > temp) {
				temp = array[i][row];
			}
		}
		return temp;
	}
}
