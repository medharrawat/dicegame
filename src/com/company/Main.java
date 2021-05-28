package com.company;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [] player = roll();
		int [] comp = roll();
		int playerTotal = total(player);
		int compTotal = total(comp);
		String winner = compare (playerTotal, compTotal);
		//System.out.println(Arrays.toString(player));
		//System.out.println(Arrays.toString(comp));
		//System.out.println("Player's total: " + playerTotal);
        	//System.out.println("Computer's total: " + compTotal);
        	//System.out.println(winner + " wins!");
	}
	
	public static int [] roll(){
		Random r = new Random();
        	int [] arr = new int [5];
        	for (int i = 0; i < arr.length; i++){
            		arr [i] = r.nextInt(6) + 1;
        	}
        	return arr;
	//hello
    	}
	
	public static int total (int [] arr){
		int temp = 0;
		for (int j = 0; j < arr.length; j++){
			temp += arr [j];
		}
		return temp;
	}
	
	public static String compare (int p, int c){
		if (p > c){
			return "Player";
		} else if (c > p){
			return "Computer";
		} else {
			return "Tie";
		}
	}
}
