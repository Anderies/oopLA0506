package LearningS7;

public class Faculty extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Faculty();
	}
	
	public Faculty() {
		System.out.println("(4) Performs Faculty's Tasks");
	}
	
}

class Employee extends Person{
	public Employee() {
		this("(2) Invokes Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks ");
	}

	public Employee(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
}

class Person{
	public Person() {
		System.out.println("(1) Performs Person's tasks");
	}
}
