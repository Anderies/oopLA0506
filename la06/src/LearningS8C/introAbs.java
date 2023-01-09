package LearningS8C;

// Kelas Abstract
abstract class Shape {
	String color;

//	Abstract Methods
	abstract double area();

//	Abstract Methods
	public abstract String toString();

	public Shape(String color) {
		System.out.println("Shape Constructor Called");
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}

// Kelas Kedua Subclass
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + super.getColor() + " and area is : " + area();
	}
}

// Kelas 3 Rectangle
class Rectangle extends Shape {
//	Attributes 
	double length;
	double width;

//	Constructor
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

//  Concrete Methods
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

//	Concrete Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}

}

public class introAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Black", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
