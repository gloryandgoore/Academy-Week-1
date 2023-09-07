package com.bptn.course.week1;

public class VariableOperations {

	public static void main(String[] args) {
		int numOne = 2;
		int numTwo = 4;
		System.out.println("numOne is: " + numOne);
		System.out.println("numTwo is: " + numTwo);

		
		//add
		int sum = numOne + numTwo;
		System.out.println("numOne + numTwo = " + sum);
		
		//subtract
		int difference = numOne - numTwo;
		System.out.println("numOne - numTwo = " + difference);
		
		//division
		int quotient = numOne / numTwo;
		System.out.println("numOne / numTwo " + quotient);
		
		//multiplication
		int product = numOne * numTwo;
		System.out.println("numOne * numTwo " + product);
		
		//new Values
		numOne = 10;
		numTwo = 20;
		
		System.out.println("numOne is now : " + numOne + ". numTwo is now : " + numTwo + ".");
		
		//more variables
		String animal = "penguin";
		char cG = 'C';
		System.out.println("My first name starts with: " + cG + ". My favorite animal is: " + animal + ".");
		


	}

}
