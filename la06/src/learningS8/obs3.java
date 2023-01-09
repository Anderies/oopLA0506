package learningS8;

// In Java, kita dapat memiliki abstract class
// tanpa abstract method sama sekali. ini membuat kita
// dapat membuat kelas-kelas yang tidak harus di inisiasi tapi bisa di wariskan

// Kelas 1 
// Sebuah kelas abstrak tanpa metode abstrak
abstract class BaseThree{
	void fun() {
		System.out.println("Function of Base class is called");
	}
}

// Kelas 2
class DerivedThree extends BaseThree{
//	Kelas ini hanya mewariskan metode dan attribute Kelas BaseThree
}

// Kelas 3
public class obs3 {
//	Main Driver method
	public static void main(String args[]) {
//		Membuat Objek Kelas 2
		Derived d = new Derived();
		d.fun();
		
	}
}
