package learningS4;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4.1 Declare and Creating Array in Java
		int[] kumpulanAngka = {1, 2, 3, 4, 5};
		int[] kumpulanAngka1 = new int[10];
		String kumpulanString[] = {"Car", "Pesawat", "Tank"};
		String kumpulanTipe[] = {"Komersial", "Tempur", "Logistic"};
		
//		4.1.1 Accessing Array
//		System.out.println(kumpulanAngka[0]);
//		System.out.println(kumpulanString[1]);
		
//		4.2 Array Size
//		System.out.println(kumpulanAngka.length);
//		System.out.println(kumpulanString.length);
		
//		4.3 Processing Array
//		System.out.println(kumpulanAngka[0] + kumpulanAngka[1]);
//		System.out.println(kumpulanString[1] + " " + kumpulanTipe[2]);
		
//		4.3.1 Displaying All The Array Item
//		for(int i = 0; i<kumpulanString.length; i++ ) {
//			System.out.println(kumpulanString[i]);
//		}
		
//		4.3.2 Counting All The Array Element
//		kumpulanAngka
//		int totalPerhitungan = 0;
//		for(int j = 0; j<kumpulanAngka.length; j++) {
//			totalPerhitungan += kumpulanAngka[j]; 
//		}
		
//		System.out.println(totalPerhitungan);
		
//		4.4 Process Array
//		4.4.1 Intialize Arrray from user input
//		double[] myList = new double[10];
//		Scanner input = new Scanner(System.in);
//	
//		System.out.print("Enter " + myList.length + " values: ");
//		
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = input.nextDouble();
//		}
		
//		4.4.2 Display All The Array Element
		
//		for (int i = 0; i < myList.length; i++) {
//			System.out.print(myList[i] + " ");
//		}
		
//		4.4.3 Sum All of the array item values
//		double total = 0;
//		for (int i = 0; i < myList.length; i++) {
//			total += myList[i];
//		}
		
		
//		4.4.4 Displaying the maximum value of the array item
//		int[] myList = {1, 2, 3, 5};
//		double max = myList[0];
//		for (int i = 1; i < myList.length; i++) {
//			if (myList[i] > max) {
//				max = myList[i];
//			}	
//		}
//		System.out.println(max);

//		4.4.5 Using For Each Loop to display element
//		int[] myList = {1,2,3,5};
//		for (int element: myList) {
//			System.out.println(element);
//		}
		
//		4.5 Copying Array
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		
		System.out.println(targetArray[0]);

	}

}
