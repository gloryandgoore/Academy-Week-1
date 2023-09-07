package com.bptn.course.week1;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int i = scanner.nextInt();
		if(i > 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is negative");
		}
		scanner.close();
		
	}

}
