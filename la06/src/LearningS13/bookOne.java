package LearningS13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bookOne {

	public static void main(String[] args) {
//		listingOne();
//		listingTwo();
//		listingThree();

		listingFour();
//		listingFive();
//		listingSix();
	}

	public static void listingOne() {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
	}

	public static void listingTwo() {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		if (number2 != 0)
			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		else
			System.out.println("Divisor cannot be zero ");
	}

	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
			System.out.println("Divisor cannot be zero");
			System.exit(1);
		}
		return number1 / number2;
	}

	public static void listingThree() {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		int result = quotient(number1, number2);
		System.out.println(number1 + " / " + number2 + " is " + result);
	}

	public static void listingFour() {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
//		without try and catch
//		int result = quotient(number1, number2);
//		int result = number1 / number2;
//		System.out.println(number1 + " / " + number2 + " is " + result);

//		with try and catch
		try {
//			int result = quotient(number1, number2);
			int result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " is " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Exception: an integer " + "cannot be divided by zero ");
		}
		System.out.println("Execution continues ...");
	}

	public static void listingFive() {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("Enter an integer: ");
				int number = input.nextInt();
				// Display the result
				System.out.println("The number entered is " + number);
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine(); // Discard input
			}
		} while (continueInput);
	}

	public static void listingSix() {
		try {
			System.out.println(sum(new int[] {}));
//			System.out.println();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());

			System.out.println("\nTrace Info Obtained from getStackTrace");
			StackTraceElement[] traceElements = ex.getStackTrace();
			for (int i = 0; i < traceElements.length; i++) {
				System.out.print("method " + traceElements[i].getMethodName());
				System.out.print("(" + traceElements[i].getClassName() + ":");
				System.out.println(traceElements[i].getLineNumber() + ")");
			}
		}
	}

	private static int sum(int[] list) {
		int result = 0;
		
		for (int i = 0; i <= list.length; i++) {
			result += list[i];
		}
		
		return result;
	}
}
