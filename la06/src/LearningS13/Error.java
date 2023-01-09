package LearningS13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(Sys)
		Scanner input = new Scanner(System.in);
		System.out.print("Input Two Integer Number: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3;
//		number3 = number1 / number2;

		
		if(number2 !=0) {
			System.out.println("Hasil" + (number1 / number2));
		}else {
			System.out.println("Divisor cannot be zero");
		}
		
		System.out.println("test terminated");
		
//		number3 = number1 / number2;
//		System.out.println("Hasil" + number3);
//		try {
//			Scanner input = new Scanner(System.in);
//			System.out.print("Input Two Integer Number: ");
//			int number1 = input.nextInt();
//			int number2 = input.nextInt();
//			int number3;
//			number3 = number1 / number2;
//			System.out.println("Hasil" + number3);
//		}catch(ArithmeticException e){
////			printStackTrace();
////			System.out.println("Hasil tidak dapat dihitung");
////			e.printStackTrace();
//			System.out.println(e.getMessage());
////			System.out.println(e.toString());
////			e.getStackTrace();
////			System.out.println(e.printStackTrace());
//		}catch(InputMismatchException e2) {
//			System.out.println("====>" + e2.getMessage());
//			System.out.println("Masukkan Input dengan benar");
//		}
//		
//		System.out.println("Selamat Tahun Baru");

	}

}
