package LearningS13;

public class TestCircleWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c4 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			System.out.println("boom");
			CircleWithException c3 = new CircleWithException(0);
			CircleWithException c5 = new CircleWithException(5);
			
			
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
	}

}
