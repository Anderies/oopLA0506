package LearningS7;

class pekerja{
	double salary = 4000000;
	
	pekerja(){
		System.out.println("no constructor");
	}
}

class dosen{
	
}

class jollybee extends pekerja{
	
}

class SLC extends pekerja{
	
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLC slc = new SLC();
		System.out.println(slc.salary);
		
//		jollybee jb = new jollybee();
//		System.out.println(jb);
		
	}

}
