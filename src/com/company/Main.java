package com.company;

import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int diceNum = findNum();
		int [] player = roll(diceNum);
		int [] comp = roll(diceNum);
		int playerTotal = total(player, diceNum);
		int compTotal = total(comp, diceNum);
		String winner = compare (playerTotal, compTotal);
		//System.out.println("Player's dice: " + Arrays.toString(player));
		//System.out.println("Computer's dice: " + Arrays.toString(comp));
		//System.out.println("Player's total: " + playerTotal);
		//System.out.println("Computer's total: " + compTotal);
		//System.out.println(winner + " wins! Good game");
		}

	    public static int findNum(){
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		int numDice = 0;
		System.out.print("How many dice would you like to use? ");
		numDice = sc.nextInt();
		while (numDice <= 0){
		    System.out.print("Please enter an integer greater than 0: ");
		    numDice = sc.nextInt();
		}
		return numDice;
	    }

	    public static int [] roll(int diceNum){
		Random r = new Random();
		int [] arr = new int [diceNum];
		for (int i = 0; i < diceNum; i++){
		    arr [i] = r.nextInt(6) + 1;
		}
		return arr;
		//hello
	    }

	    public static int total (int [] arr, int diceNum){
		int temp = 0;
		for (int j = 0; j < diceNum; j++){
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
		    return "Tie, neither";
		}
	    }
	}

//This is for the class in which you're setting up the Jpanel
rollButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pDice.setText("Your dice are: " + Arrays.toString(player)); //if there is a text box named pDice for player dice and a button labeled "Roll"
                cDice.setText("The computer's dice are: " + Arrays.toString(comp)); // if there is a text box named cDice for computer dice
            }
        });
