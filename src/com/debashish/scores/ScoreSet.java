package com.debashish.scores;

import java.util.ArrayList;

public class ScoreSet {
	public ScoreSet() {
		scores = new ArrayList<>();
	}

	public void add(int score) {
		scores.add(score);
		if(scores.size() == 1){
			lowIndex1 = scores.get(0);
		} else if(scores.size() == 2){
			lowIndex2 = scores.get(1);
		} else {
			for(int i = 0; i < scores.size(); i++){
				int temp = scores.get(i);
				if(lowIndex1 < temp && temp != lowIndex2){
					lowIndex1 = temp;
				}
			}
			
			for(int j = 0; j < scores.size(); j++){
				int temp = scores.get(j);
				if(lowIndex2 < temp && temp != lowIndex1){
					lowIndex2 = temp;
				}
			}
		}
	}

	public double averageWithoutLowest2( )
   {
		
   }

	public String twoLow( )
   {
		return String.format("%d %d", lowIndex1, lowIndex2); // return a string consisting of the two lowest scores with a space between
   }

	public String toString( )
   {
		String result = "";
		for(int i : scores){
			result = Integer.toString(i) + "";
		}
		
		return result;
		
		// return each element of the array list separated by spaces as a string
   }

	private ArrayList<Integer> scores;
	int lowIndex1;
	int lowIndex2;
}
