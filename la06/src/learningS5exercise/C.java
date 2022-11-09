package learningS5exercise;

// 9.7.3
public class C {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		Circle c = new Circle();
		System.out.println("What is radius " + c.getArea());
	}

}
