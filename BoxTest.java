//******************************************************************************************
//BoxTest.java		 	Author: Harrison Fox 
//
//Implements a main method to create multiple virtual boxes. Each object contains instance
//data for a box's height, width, depth, volume and whether or not it is full.
//******************************************************************************************

import java.util.*;

public class BoxTest{
	
	public static void main (String[]args){

		int done;
		Scanner scan = new Scanner (System.in);
		int height;
		int width;
		int depth;
		int fillBox;


		
		System.out.println("Welcome to BoxTest would you like to create a \"virtual\" box?");
		System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
		done = scan.nextInt();
		

		while (done > 0)
		{
			

			System.out.println("What would you like your box\'s height to be?");
			height = scan.nextInt();

			System.out.println("What would you like your box\'s width to be?");
			width = scan.nextInt();
			
			System.out.println("What would you like your box\'s depth to be?");
			depth = scan.nextInt();

			Box userBox = new Box (height, width, depth);
			userBox.calcVolume();
			
			System.out.println("Would you like to fill your \"virtual\" box?");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
			fillBox = scan.nextInt();
				 
				 if (fillBox > 0){
				 	userBox.fillBox();
				 }

			System.out.println(userBox);

			System.out.println("\n" + "Would you like to create another virtual box?" + "\n");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"" + "\n");
			done = scan.nextInt();

		}

		System.out.println();

		System.out.println("Thank you for using BoxTest! Goodbye" + "\n");

	}
}
