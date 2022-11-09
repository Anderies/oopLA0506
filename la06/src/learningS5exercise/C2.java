package learningS5exercise;

public class C2 {
	
	public static void main(String[] args) {
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
