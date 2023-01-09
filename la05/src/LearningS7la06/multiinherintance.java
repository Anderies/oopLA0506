package LearningS7la06;

class first{
	first(){
		System.out.println("Memanggil Kelas Pertama");
	}
}

class two extends first {
	two() {
		System.out.println("Memanggil Kelas Kedua");
	}
}

class three extends two {
	three(){
		System.out.println("Memanggil Kelas Ketiga");
	}
}


public class multiinherintance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three th = new three();
		
	}

}
