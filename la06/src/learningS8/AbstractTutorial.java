package learningS8;


abstract class Dog{
	String breed;
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
}

class Cihuahua extends Dog{
	public void poop() {
		System.out.println("Dog Pooped!");
	}
}

public class AbstractTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cihuahua c = new Cihuahua();
		
		c.bark();
		c.poop();
	}

}
