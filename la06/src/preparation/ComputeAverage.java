package preparation;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three numbers
		System.out.println("Enter Three Number");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute Average
		double average = (number1 + number2 + number3) / 3;
		
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

	}

}
