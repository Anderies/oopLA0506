package LearningS7La05;

abstract class Orang {
	public void status() {
		System.out.println("Saya Adalah Orang");
	}
}

class Mahasiswa extends Orang{
	String mahasiswa = "Mahasiswa";
	@Override
	public void status() {
		System.out.println("Saya di Universitas Menjadi Seorang " + mahasiswa);
	}
}

class Anak extends Orang{
	String anak = "Anak";
	@Override
	public void status() {
		System.out.println("Saya dirumah menjadi seorang " + anak);
	}
}

class MahasiswaPanitia extends Mahasiswa{
	String panitia = "Panitia";
	@Override
	public void status() {
		System.out.println("Saya di Universitas Menjadi Seorang " 
	+ super.mahasiswa + " dan " + panitia);
	}
}

public class polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mhs = new Mahasiswa();
		mhs.status();
		Anak ank = new Anak();
		ank.status();
		MahasiswaPanitia mc = new MahasiswaPanitia();
		mc.status();
	}
}
