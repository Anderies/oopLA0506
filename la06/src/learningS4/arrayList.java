package learningS4;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Declare and Creating Array List
		ArrayList fruitList = new ArrayList();
		ArrayList<String> fruitList2 = new ArrayList<String>();
		
//		2. Adding element to Array List
		fruitList.add("Manggo");
		fruitList.add("Durian");
		
//		3. Print All of the element
		System.out.println(fruitList);
//		System.out.println(fruitList.get(1));
		System.out.println(fruitList.remove(0));
	}

}
