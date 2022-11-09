package LearningS7;

//Java Code to show use of
//super keyword with constructor

//superclass Person
class PersonThree {
	PersonThree() {
		System.out.println("Person class Constructor");
	}
}

//subclass Student extending the Person class
class StudentTwo extends PersonThree {
	StudentTwo() {
		// invoke or call parent class constructor
		super();
		System.out.println("Student class Constructor");
	}
}


public class TestSuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTwo s = new StudentTwo();
	}

}
