package LearningS8;


// Kelas Abstrak Pertama
abstract class Shape {
	String color;
	
//	Metode Abstrak
	abstract double area();
	public abstract String toString();
	
//	Constructor abstract
	public Shape(String color) {
		System.out.println("Shape Constructor Called");
		this.color = color;
	}
	
//	This concrete method
	public String getColor() {
		return color;
	}
	
}

class Circle extends Shape{
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
		return Math.PI + Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + super.getColor() + " and area is : " + area();
	}
	
}

class Rectangle extends Shape{
	
	private double length, width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}
	
}

public class introAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Black", 2.5);
		System.out.println(s1.toString());
		
		Shape s2 = new Rectangle("Blue", 3, 5);
		System.out.println(s2.toString());
	}

}
