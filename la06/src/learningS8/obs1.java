package learningS8;

// Program java untuk menjelaskan bahwa 

// instance dari sebuah abstract class 
// tidak bisa dibuat

// Class 1
// Abstract Class
abstract class Base {
	abstract void fun();
}

// Class 2 
class Derived extends Base {

	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("Derived fun() called");
	}

}

public class obs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.

		Base b = new Derived();
		b.fun();
	}

}
