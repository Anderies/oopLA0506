package LearningS13;

public class CircleWithException {
//	The radius of the circle 
	private double radius;
	private static int numberOfObjects = 0;

	public CircleWithException() {
		this(1.0);
	}

	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) throws IllegalArgumentException {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * 3.14159;
	}
}
