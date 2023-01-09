package LearningS7la06;

class Ayam{
	boolean telur = true;
	
	public void berbunyi() {
		System.out.println("Mantap");
	}
	
	Ayam(int i){
		System.out.println("Saya adalah Ayam " + i);
	}
	
	public void sambel() {
		System.out.println("tidak ada sambel");
	}
}

class AyamGeprek extends Ayam{
	boolean telur = false;
	
	public void sambel() {
		System.out.println("Sambel nya Original");
		
		super.sambel();
	}
	
	
	AyamGeprek(){
		super(1);
	}
}


public class inherintance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		AyamGeprek ag = new AyamGeprek(); // mewarasi constructor
//		ag.sambel();
	
		
	}

}
