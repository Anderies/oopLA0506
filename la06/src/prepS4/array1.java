package prepS4;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		
//		4.1 Declare and creating an array in java
		
//		String backpack[] = {"Shotgun", "Assault Riffle", "Sniper"};
//		String zombies[] = {"Close-range zombie", "Mid-range Zombie", "Long-range Zombie"};
//		int numberOfZombies[] = {1,2,3,4};
//		int totalZombies = 0;
		
		
		
//		4.2 Array Size and Default Values
		
//		System.out.println(backpack.length);
		
//		4.3 Accessing Array Elements
		
//		System.out.println(backpack[1]);
//		System.out.println(numberOfZombies[0] + numberOfZombies[1]);
//		Check all zombies number
		
//		for(int i = 0; i<numberOfZombies.length;i++) {
////			System.out.println(numberOfZombies[i]);
//			totalZombies += numberOfZombies[i];
//		}
		
//		System.out.println(totalZombies);
		
//		4.4 Array Intializer
//		double[] myList = {1.9, 2.9, 3.4, 3.5};
//		Equivalent to double[] myList = new double[4];
//		double[] myList = new double[4];
//		myList[0] = 1.9;
//		myList[1] = 2.9;
//		myList[2] = 3.4;
//		myList[3] = 3.5;
//		Cannot
//		double[] numberOfZombies;
//		numberOfZombies = {1.9, 2.9, 3.4, 3.5}; // Wrong
		
//		4.6 Processing Array
//		4.6.1 Menginisialisasi array dengan input value dari user
//		double[] myList = new double[10];
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		System.out.print("Enter " + myList.length + " values: ");
		
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = input.nextDouble();
//		}
	
//		4.6.2 Menginisialisasi array dengan random value
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = Math.random() * 100;
//		}
		
//		4.6.3 menampilkan seluruh isi array
//		for (int i = 0; i < myList.length; i++) {
//			System.out.print(myList[i] + " ");
//		}
		
//		4.6.4 menjumlah seluruh element array
//		double total = 0;
//		for (int i = 0; i < myList.length; i++) {
//			total += myList[i];
//		}
		
//		4.6.5 menemukan element terbesar
//		double max = myList[0];
//		for (int i = 1; i < myList.length; i++) {
//			if (myList[i] > max) max = myList[i];
//		}
		
//		4.6.6 Foreach in java
//		int myListNumber[] = {0,1,2,3,4,5};
//		for (int element: myListNumber) {
//			// Process the element
//			System.out.println(element);
//		}
//		
		
//		4.7 AnalyzeNumbers Java
//		Buatlah sebuah program yang membaca angka dari user input
//		lalu tampilkan rata2 dari seluruh angka user input dan cari 
//		dan tampilkan array index mana yang memiliki 
//		nilai yang lebih besar dari rata2
		// TODO Auto-generated method stub
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of times: ");
//		
//		int n = input.nextInt();
//		
//		double[] numbers = new double[n];
//		double sum = 0;
//		
//		System.out.println("Enter the numbers: ");
//		
//		for(int i = 0;i<n;i++) {
//			numbers[i] = input.nextDouble();
//			sum += numbers[i];
//		}
//		
//		double average = sum / n;
//		
//		int count = 0;
//		
//		for(int i = 0;i < n; i++) {
//			if(numbers[i] > average) {
//				count++;
//			}
//		}
//		
//		System.out.println("Average is " + average);
//		System.out.println("Number of elements above the average is " + count);
		
////		4.8 Deck of Cards
//		int[] deck  = new int[52];
//		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9"
//				,"10", "Jack", "Queen", "King"};
//		
////		intialize the cards
//		for (int i = 0; i < deck.length; i++) {
//			deck[i] = i;
//		}
//		
////		Shuffle the cards
//		for (int i = 0;i < deck.length; i++) {
////			generate random index
//			int index = (int)(Math.random() * deck.length);
//			int temp = deck[i];
//			deck[i] = deck[index];
//			deck[index] =temp;
//		}
//		
////		Display the first four cards
//		for (int i = 0;i < 4; i++) {
//			String suit = suits[deck[i] / 13];
//			String rank = ranks[deck[i] % 13];
//			System.out.println("Card number " + deck[i] + ": " 
//					+ rank + " of " + suit);
//		}
		
//		4.9 Copying Array
//		int[] sourceArray = {2, 3, 1, 5, 10};
//		int[] targetArray = new int[sourceArray.length];
//		for (int i = 0; i < sourceArray.length; i++) {
//			targetArray[i] = sourceArray[i];
//		}
		
	}

}
