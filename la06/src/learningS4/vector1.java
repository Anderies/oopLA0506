package learningS4;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(); 
		
		v1.add(5);
		v1.add("Sapu");
		v1.add(7);
		
		System.out.println(v1.get(1));
		System.out.println(v1.isEmpty());
	}

}
