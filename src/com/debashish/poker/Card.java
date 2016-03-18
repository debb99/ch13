package com.debashish.poker;

public class Card {
	public Card(int num, int s) {
		if(checkRange(1, 13, num) && checkRange(1, 4, s)){
			if(checkRange(1, 10, num)){
				value = Integer.toString(num);
			} else {
				switch(num){
				case 11: value = "J";
				break;
				case 12: value = "Q";
				break;
				case 13: value = "K";
				break;
				}
			}
			switch(s){
			case 1: suit = "C";
			break;
			
			case 2: suit = "D";
			break;
			
			case 3: suit = "H";
			break;
			
			case 4: suit = "S";
			break;
			}
		}
	}
	
	private boolean checkRange(int min, int max, int a){
		return (min <= a && a <= max);
	}
	
	public String getCardID(){
		return value + suit;
	}
	
	String value;
	String suit;
}