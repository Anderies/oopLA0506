package preparationS3;

//Override of static method
class Parent {

	 // static method
	 static void show()
	 {
	     System.out.println("Parent");
	 }
}

//Parent inherit in Child class
class Child extends Parent {

	// cannot override show() of Parent
//	 void show()
//	 {
//	     System.out.println("Child");
//	 }
}



//Override of non-static method

class ParentNonStatic {
 void show()
 {
     System.out.println("Parent");
 }
}

//Parent inherit in Child class
class ChildNonStatic extends ParentNonStatic {

 // override show() of Parent
 void show()
 {
     System.out.println("Child");
 }
}



public class staticNonStatic4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
        // calling Parent's show()
        p.show();
        // cannot override Parent's show()
        
        ParentNonStatic p1 = new ParentNonStatic();
        // calling Parent's show()
        p1.show();

        ChildNonStatic c1 = new ChildNonStatic();
        // calling Child's show()
        c1.show();
	}

}
