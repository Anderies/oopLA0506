package LearningS13;

import java.util.ArrayList;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question3();
		question4();
	}
	
	public static void question3(){
		int x = 3;
		
		System.out.println((true)&&(3>9));
		System.out.println(!(x>0) == !(x>0));
		System.out.println((x > 0 || x < 10) == ((x > 0) || (x < 10)));
		System.out.println((x>=0) || (x<0));
		System.out.println(x+5 != 8);
		System.out.println("=============================");
		
		System.out.println(2 * 2 - 3 > 2 && 4 - 2 > 5);
		System.out.println(2 * 2 - 3 > 2 || 4 - 2 > 5);
		
	}
	
	public static void question4() {
		ArrayList str = new ArrayList();
		str.add("Boom");
		str.add("Lala");
		str.remove("Boom");
//		str.get(0);
		
//		System.out.println(str.insert());
	}

}
