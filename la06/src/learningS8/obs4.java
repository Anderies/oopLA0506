package learningS8;

// Program Java dapat juga memiliki final method


// Kelas 1
// Kelas Abstrak
abstract class BaseFour{
//	final variable => to create constant variable
//	final methods => prevent method overriding
//	final classes => prevent inheritance
	final void fun() {
		System.out.println("Base fun() called");
	}
}

// Kelas 2
class DerivedFour extends BaseFour{
	
}

public class obs4 {

	public static void main(String[] args) {
//		Membuat Object Kelas Abstrak
		BaseFour bf = new DerivedFour();

		bf.fun();

	}

}
