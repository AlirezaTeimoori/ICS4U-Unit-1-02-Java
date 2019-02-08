//---------------------------------------

//-- Created by:     Alireza Teimoori  --

//-- Created on:     Feb 8 2019        --

//-- Created for:    Unit 1-01         --

//-- Course Code:    ICS4U             --

//-- Teacher Name:   Chris Atkinson    --

//---------------------------------------

import java.util.*;

class logss{
	private static Scanner input;

	public static void main(String[]args){

	input = new Scanner(System.in);
	
	// Defining variables:
	double each;
	double weigh = 20;
	double answer;
	
	// Asking for user input and storing it into "double each":
	System.out.println("Ener the lengh of logs in meters. (0.25, 0.5, 1)");
	each = input.nextDouble();
	
	// Calculations:
	answer = 1100/weigh/each;
	
	// Printing the answer:
	System.out.println("The answer is: " + answer);
	
	}
}