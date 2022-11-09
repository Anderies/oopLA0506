package LearningS7overriding;

class Heroes{
	public void status() {
		System.out.println("I Have Agi, Int and Str Status");
	}
}


class Tank extends Heroes{
	public void status() {
		System.out.println("I Have More Strength Status");
	}
}

class Mage extends Heroes{
	public void status() {
		System.out.println("I Have more Intelligent Status");
	}
}

public class overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
		t.status();
		
		Mage m = new Mage();
		m.status();
	}

}
