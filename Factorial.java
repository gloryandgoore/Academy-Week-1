package com.bptn.course.week1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//new scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {
			//multiply by current loop variable value
				fact *= i;
				
			}
		
		System.out.println("The Factorial of " + num + " is: " + fact);
			
	
		scanner.close();
	}
}
