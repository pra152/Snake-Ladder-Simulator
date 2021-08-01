package com.bridgelabz.snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
        public static void main(String[] args) {
        	SnakeAndLadder dice=new SnakeAndLadder();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Fisrt Player:");
			int player1=sc.nextInt();
			int rolldice=dice.roll();
			System.out.println("Roll the dice in the Board" + rolldice);
		}
        public static int roll() {
          int diceRoll = (int)(Math.random()*6 )+1 ;
          return diceRoll;
        }
}
	
	
    
    
    

    
       

        
