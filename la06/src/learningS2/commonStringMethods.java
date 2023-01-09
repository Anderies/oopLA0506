package learningS2;

import java.util.Scanner;

public class commonStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Sebuah Kalimat =");
		
		String word1 = input.nextLine();
//		CommonStringMethods
//		String word1 = "Selamat Pagi Selamat Datang di BINUS ";
//		String word2 = "Selamat Bersenang2";
//		Length Methods
		System.out.println("Panjang Kalimat yang dimasukkan adalah = " + word1.length());
//		ChartAt
		System.out.println("Index Pertama Huruf nya adalah = " + word1.charAt(0));
//		Concat
//		System.out.println(word1.concat(word2));
	}

}
