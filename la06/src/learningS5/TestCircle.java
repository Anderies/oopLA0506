package learningS5;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle1 = new Circle();
		
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + 
		circle1.getArea());
		
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + "is" + circle2.getArea());

		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	
//		9.5 Accessing Objects via Reference Variables
		Circle myCircle;
		myCircle = new Circle();
		
		
//		9.5.1 Without Variable
		new Circle();
		System.out.println("Area is " + new Circle(5).getArea());
		
//		9.5.2 Reference Data Fields and the null values
//		if the data from constructor then it will be default value null, false
//		and if it is local variable it will be compiled error.
	}

}
