package com.bridgelabz;
import java.util.*;
public class SnakeAndLadder 
{
	public static void main(String[] args)
	{
		int Position = 0;
		Scanner Scan = new Scanner( System.in );
		System.out.println("your position is " +Position);
		int Dice = (int)Math.floor(Math.random()*10) % 6+1;
		System.out.println("Your Dice Value is : " +Dice);
		Position = Position + Dice;
		int Check = (int)Math.floor(Math.random() * 10) % 3+1;
		System.out.println("You Chose Case Number Is: "+Check);
		switch (Check) 
		{
		case 1:
			//Position = Position + Dice;
			System.out.println("your Dice Position is : " +Position);
			break;
		case 2:
			Position = Position - Dice;
			System.out.println("your Dice Position is : " +Position);
			break;	
		case 3:
			System.out.println("Player No Play Stay In The Same Position : "+Position);
			break;
		default:
			break;
		}
		
	}
	

}
