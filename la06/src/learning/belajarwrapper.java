package learning;

public class belajarwrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10; // primitive variable
		
//		Cara Pertama mendeklarasi sebuah wrapper
//		Integer b = 10;
//		Cara kedua data type primitive menjadi wrapper boxing;
//		Integer.valueOf(a);
//		Cara ketiga yang sudah deprecated
//		Integer c = new Integer(3);
		
//		
//		
//		System.out.println("Nilai a: " + a);
//		System.out.println("Nilai wrapper b: " + b);
		
		String word1 = "Good Day";
		String word2 = "Bad Day";
		
		Integer a = 2;
		Integer b = 2;
		
		int c = 2;
		int d = 2;
		
		if(word1 == word2) {
			System.out.println("Word Object Sama");
		}else {
			System.out.println("Word Object Tidak Sama");
		}
		
		if(word1.equals(word2)) {
			System.out.println("Percobaan Equals = Word Object Sama");
		}else {
			System.out.println("Percobaan Equals = Word Object Tidak Sama");
		}
		
//		if(a.equals(b)) {
//			System.out.println("Integer Sama");
//		}else {
//			System.out.println("Integer Tidak Sama");
//		}
	}

}
