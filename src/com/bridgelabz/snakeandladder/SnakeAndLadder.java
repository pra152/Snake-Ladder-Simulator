package com.bridgelabz.snakeandladder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
	static int winpoint=100;
	static Map < Integer , Integer > snake = new HashMap < Integer , Integer >();
    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
     
    {
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);
         
        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
    }
        public static void main(String[] args) {
        	SnakeAndLadder dice=new SnakeAndLadder();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Fisrt Player:");
			int player=sc.nextInt();
			int rolldice=dice.roll();
			System.out.println("Roll the dice in the Board" + rolldice);
			int player1=dice.calculatePlayerValue(player, rolldice);
			System.out.println("The position of player is"+player1);
			boolean win=dice.isWin(player);
			System.out.println("IS there player win ?" +win);
			
		}
        
		public  int roll() {
          int diceRoll = (int)(Math.random()*6 )+1 ;
          return diceRoll;
        }
		public int calculatePlayerValue(int player, int diceValue)
		{
		    player = player + diceValue;
		      
		    if(player > winpoint)
		    {
		        player = player - diceValue;
		        return player;
		    }
		      
		    if(null!=snake.get(player))
		    {
		        System.out.println("Move behind by ladder");
		        player= snake.get(player);
		    }
		      
		    if(null!=ladder.get(player))
		    {
		        System.out.println("climb up the ladder");
		        player= ladder.get(player);
		    }
		    System.out.println(player);
		    return player;
		}
		public boolean isWin(int player)
		{
			
		    return winpoint == player;
		}
        

          
        }

	
	
    
    
    

    
       

        
