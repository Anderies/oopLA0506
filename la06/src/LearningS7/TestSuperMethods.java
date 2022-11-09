package LearningS7;

//2. Java program to show use of super with methods
//superclass Person
class PersonTwo {
	void message() {
		System.out.println("This is person class\n");
	}
}

//subclass Student
class Student extends PersonTwo {
	void message() {
		System.out.println("This is student class");
	}

	void display() {
		// will invoke or call current
     // class message() method
		message();
		// will invoke or call parent
        // class message() method
		super.message();
	}
}

public class TestSuperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}

}
