package LearningS13;

public class CircleWithExceptionTwo {
	private double radius;
	
	private static int numberOfObjects = 0;
	
//	Constructor
	public CircleWithExceptionTwo() {
		this(1.0);
	}

	public CircleWithExceptionTwo(double newRadius) {
		// TODO Auto-generated constructor stub
		setRadius(newRadius);
		numberOfObjects++;
	}

	private void setRadius(double newRadius) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(newRadius >= 0) {
			radius = newRadius;
		}else {
			throw new IllegalArgumentException("Radius cannot be negative");
		}	
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * 3.14159;
	}
	
}
