package com.bptn.course.week1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		if (input == 1) {

			int firstNum = scanner.nextInt();

			int secondNum = scanner.nextInt();

			double sum = firstNum + secondNum;
			input = scanner.nextInt();
			if (input != 1) {
				System.out.print(sum);
			}

		} else if (input == 2) {

			int firstNum = scanner.nextInt();
			int secondNum = scanner.nextInt();

			double difference = firstNum - secondNum;
			input = scanner.nextInt();
			if (input != 1) {
				System.out.print(difference);
			}

		} else if (input == 3) {

			int firstNum = scanner.nextInt();

			int secondNum = scanner.nextInt();

			double product = firstNum * secondNum;
			input = scanner.nextInt();

			if (input != 1) {
				System.out.print(product);
			}

		} else if (input == 4) {

			double firstNum = scanner.nextDouble();

			double secondNum = scanner.nextDouble();

			double quotient = firstNum / secondNum;
			double remainder = firstNum % secondNum;
			input = scanner.nextInt();
			if (input != 1) {
				System.out.println("Dividing " + firstNum + " by " + secondNum + " the quotient is " + quotient);
				System.out.println("The remainder is " + remainder);
			} else {
				input = scanner.nextInt();
			}
		} else if (input == 5) {

			int firstNum = scanner.nextInt();

			double squared = firstNum * firstNum;

			input = scanner.nextInt();
			if (input != 1) {
				System.out.print(squared);
			}

		} else if (input == 6) {

			double firstNum = scanner.nextDouble();

			double sqRoot = Math.sqrt(firstNum);

			input = scanner.nextInt();
			if (input != 1) {
				System.out.print(sqRoot);
			}

		} else if (input == 7) {

			double firstNum = scanner.nextDouble();

			double reciprocal = 1 / firstNum;

			input = scanner.nextInt();
			if (input != 1) {
				System.out.print(reciprocal);
			}

		} else {
			System.out.println("Invalid choice! Please make a valid choice.");
		}
		scanner.close();
	}
}
