package com.bptn.course.week1;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate a String");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");
		System.out.println("Enter the option");

		int input = scanner.nextInt();
		scanner.nextLine();

		if (input == 1) {

			System.out.println("Enter the string to check for palindrome: ");
			String firstStr = scanner.nextLine();
			String reverseInput = "";

			for (int i = firstStr.length() - 1; i >= 0; i--) {
				reverseInput += firstStr.charAt(i);

			}
			if (firstStr.equals(reverseInput)) {
				System.out.println(firstStr + " is palindrome");
			} else {
				System.out.println(firstStr + " is not palindrome");

			}

		} else if (input == 2) {

			System.out.println("Enter a String: ");
			String inputString = scanner.nextLine();
			String reverseInput = "";
			for (int i = inputString.length() - 1; i >= 0; i--) {
				reverseInput += inputString.charAt(i);
			}
			System.out.println(reverseInput);

		} else if (input == 3) {

			String firstStr = scanner.nextLine();
			String secondStr = scanner.nextLine();

			System.out.println(firstStr + secondStr);

		} else if (input == 4) {
			String firstStr = scanner.nextLine();
			String secondStr = scanner.nextLine();

			if (firstStr.equals(secondStr)) {
				System.out.println("Strings are equal");
			} else {
				System.out.println("Strings are not equal");
			}
		} else if (input == 5) {

			String inputStr = scanner.nextLine();

			System.out.println(inputStr.length());

		} else {
			System.out.println("Invalid choice! Please make a valid choice.");
		}
		scanner.close();
	}
}
