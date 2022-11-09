package LearningS7La05;

class Heroes {
	int attack = 10;
	
	Heroes(){
		System.out.println("Initialize Heroes Damage");
		System.out.println("Initialize Heroes Health Point");
		System.out.println("Initialize Heroes Heroes Speed");
	}
	
	public void Status() {
		System.out.println("I Have Agility, Health Point and Intelligent");
	}
	
	public void messages() {
		System.out.println("Saya Mempunyai Tidak Mempunyai Senjata");
	}
}

class Tank extends Heroes {
	int attack = 30;
	
	Tank(){
		super();
	}
	
	public void Status() {
		System.out.println("Damage Status : " + super.attack);
	}
}


class Mage extends Heroes{
	public void messages() {
		System.out.println("Saya Mempunyai Buku / Tongkat");
		super.messages();
	}
}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
//		System.out.println("Damage: " + t.attack);
		t.Status();
//		
//		Mage m = new Mage();
//		System.out.println("Damage dari Mage: " + m.attack);
//		
//		Mage m2 = new Mage();
//		m2.messages();
//		System.out.println("Tipe Senjata : " + );
	}

}
