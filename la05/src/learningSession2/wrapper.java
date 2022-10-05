package learningSession2;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		3 Cara dalam membuat Wrapper
//		Cara Pertama
//		Primitive		Wrapper
//		char			Character
//		short			Short
//		int				Integer
//		long			Long
//		float			Float
//		double			Double
		
//		Cara 1: Deklarasi Menggunakan Capitalize
		Integer wrapper1 = 10;
//		Cara 2: Menggunakan Construktor
		Integer wrapper2 = new Integer(10);
//		Cara 3: Menggunakan valueOf
		Integer wrapper3 = Integer.valueOf(10);
		
		System.out.println("cara pertama = " + wrapper1.toString().length());
		System.out.println("cara kedua = " + wrapper2.toString().length());
		System.out.println("cara ketiga = " + wrapper3.toString().length());
		
		
//		Common String Function
		
		String word1 = "angka 1";
		String word2 = "angka 1";
		
		System.out.println("Hasil Perbandingan = " + (word1 == word2));
		System.out.println("Hasil Perbandingan Kedua = " + word1.equals(word2));
		System.out.println("Hasil Perbandingan Ketiga = " + word1.compareTo(word2));
		
//		Math Function
		double math1 = 11.5;
		System.out.println(Math.PI);
		System.out.println("Pembulatan Keatas = " + Math.ceil(math1));
		System.out.println("Pembulatan Kebawah = " + Math.floor(math1));
		System.out.println("Pembulatan Normal (Jika 0,4 kebawah kalo 0,5 ke atas) = " 
		+ Math.round(math1));
		
		int gacha1 = (int) (Math.random() * 2);
		if(gacha1 == 1) {
			System.out.println("Selamat Anda Dapet Kamisato Ayaka");
		}else {
			System.out.println("Dapet Dummy" + gacha1);
		}
		
//		Arithmetic Operator
		double a = 3;
		double b = 2;
//		Addition
		System.out.println("Addition  =" + a + b);
//		Subtraction
		System.out.println("Subtraction = " + (a - b));
//		Division
		System.out.println("Division = " + a / b);
//		Multiply
		System.out.println("Multiply = " + a * b);
//		Remainder
		System.out.println("Remainder = "+ a % b);
//		Priority of operation is * or / from left to right if you want to addition first you can use ()
		System.out.println((a+b)*3);
		System.out.println(a+b*3);
		
		
		int firstVar = 1;
		firstVar++;
		++firstVar;
		System.out.println("Increment = " + firstVar);
		firstVar--;
		--firstVar;
		System.out.println("Decrement = " + firstVar);
	}

}
