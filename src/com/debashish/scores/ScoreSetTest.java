package com.debashish.scores;

import java.util.Random;

public class ScoreSetTest {
	public static void main(String[] args) {
		Random generator = new Random();

		// generate an array of 6 tests
		ScoreSet set = new ScoreSet();

		// add random test scores in the range of 60 to 100
		for (int i = 0; i < 6; i++)
			set.add(generator.nextInt(41) + 60);

		// print the scores
		System.out.println(set + "\n");

		// remove the two lowest scores
		double average = set.averageWithoutLowest2();
		System.out.println("Average = " + average);

		// print the two low scores
		System.out.println("The two low scores: " + set.twoLow());
	}
}
