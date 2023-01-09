package learningS8;

// Program Java yang menjelaskan
// bahwa abstract class dapat berisi constructor

// Kelas Pertama
// Kelas Abstract
abstract class BaseTwo {
	//	Constructor Kelas Pertama
	BaseTwo() {
		System.out.println("Base Constructor Called");
	}

	// Metode Abstract didalam Kelas 1
	abstract void fun();

}

// Kelas Kedua
class DerivedTwo extends BaseTwo {
    // Constructor Kelas kedua
	DerivedTwo()
    {
        System.out.println("Derived Constructor Called");
    }

	// Metode Kelas kedua
    void fun()
    {
        System.out.println("Derived fun() called");
    }

}

public class obs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of class 2
        // inside main() method
		DerivedTwo d = new DerivedTwo();
        d.fun();
	}

}
