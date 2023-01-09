package LearningS7;

interface one{
	public void print_geek();
}

interface two{
	public void print_for();
}

interface three extends one, two{
	public void print_geek();
}

class child implements three{
	public void print_geek() {
		System.out.println("Geeks");
	}

	@Override
	public void print_for() {
		// TODO Auto-generated method stub
		System.out.println("for");
	}
}

public class multipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
