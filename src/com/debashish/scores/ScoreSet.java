package com.debashish.scores;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreSet {
	public ScoreSet() {
		scores = new ArrayList<>();
	}

	public void add(int score) {
		scores.add(score);
		sort(scores);
	}

	public double averageWithoutLowest2() {
		int i;
		int sum = 0;
		for(i = 0; i < scores.size() - 2; i++){
			sum += scores.get(i + 2);
		}
		
		
		return sum / i;
	}

	public String twoLow() {
		return String.format("%d %d", scores.get(0), scores.get(1));
	}

	public String toString() {
		return scores.toString();

		// return each element of the array list separated by spaces as a string
	}

	public void sort(ArrayList<Integer> array){
		for (int j = 0; j <= array.size(); j++){
			for (int i = 0; i < array.size() - 1; i++){
				if (array.get(i) > array.get(i + 1)){
					int temp = array.get(i);
					array.set(i, array.get(i + 1));
					array.set(i + 1, temp);
				}
			}
		}
	}

	private ArrayList<Integer> scores;
	int lowIndex1;
	int lowIndex2;
}
