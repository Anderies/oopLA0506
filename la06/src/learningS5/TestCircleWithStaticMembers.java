package learningS5;

// Listing 9.7

/*
 * Cheat Sheet
 * 
 * A Static Method cannot invoke an instance method and cannot access instance data field
 * it must through object constructor and access it
 * 
 * as for non static instance method can invoke an instance method/data field and a static method/data field
 * 
 * 
 * 
 */
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
//		A Static variable is shared by all objects of the class. a static method cannot access instance members of the class
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleStatic.numberOfObjects);
		
//		Create c1
		CircleStatic c1 = new CircleStatic();
		
// 		Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		
		
//		Create c2
		CircleStatic c2 = new CircleStatic();
//		Modify c1
		c1.radius = 9;
		
//		Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
	}

}
