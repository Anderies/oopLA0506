package LearningS7La05;

class Orang {
	public void status() {
		System.out.println("Saya Adalah Orang");
	}
}

class Mahasiswa extends Orang{
	@Override
	public void status() {
		System.out.println("Saya di Universitas Menjadi Seorang");
		System.out.println("Mahasiswa");
	}
}

class AnakBerbakti extends Orang{
	@Override
	public void status() {
		System.out.println("Saya dirumah menjadi seorang");
		System.out.println("Anak yang menyenangkan");
	}
}

public class polymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mhs = new Mahasiswa();
		
		mhs.status();
		
		AnakBerbakti ank = new AnakBerbakti();
		
		ank.status();
	}

}
