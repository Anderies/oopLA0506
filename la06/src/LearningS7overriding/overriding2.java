package LearningS7overriding;

// Override
class B {
	public void p(double i) {
		System.out.println(i * 2);
	}
}

class A extends B {
// This method overrides the method in B
	public void p(double i) {
		System.out.println(i);
	}
}
//// Overloads
// class B {
//	public void p(double i) {
//		System.out.println(i * 2);
//	}
//}
//
//class A extends B {
//// This method overloads the method in B
//	public void p(int i) {
//		System.out.println(i);
//	}
//}



public class overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.p(10);
		a.p(10.0);
	}

}

