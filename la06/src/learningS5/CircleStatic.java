package learningS5;

// 9.6
public class CircleStatic {
//	The radius of the circle
	double radius;
	
//	the number of objects created
	static int numberOfObjects = 0;
	
//	Construct a circle with radius 1
	CircleStatic(){
		radius = 1;
		numberOfObjects++;
	}
	
/** Construct a circle with a specified radius */
	CircleStatic(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
/** Return numberOfObjects */
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
	
}
