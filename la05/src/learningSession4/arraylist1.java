package learningSession4;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deklarasi ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		
		ArrayList cars2 = new ArrayList();
		
		cars2.add("mantap");
		cars2.add("makasih");
		cars2.add("binus cantik");
		cars2.add(1);
		
		
//		System.out.println(cars2);
//		System.out.println(cars2.get(0));
//		System.out.println(cars2.get(2));
		
		System.out.println(cars2.isEmpty());
		System.out.println(cars2.remove(0));
		System.out.println(cars2);
	}

}
