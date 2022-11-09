package learningS5exercise;

public class Circle {
//	Data Fields
	double radius = 1;
	
//	Construct a circle object
	Circle(){
		
	}
//	Constructor : Construct a circle object
	Circle(double newRadius){
		radius = newRadius;
	}
	
//	Methods
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	

}
