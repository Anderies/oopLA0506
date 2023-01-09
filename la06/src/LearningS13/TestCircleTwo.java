package LearningS13;

public class TestCircleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CircleWithExceptionTwo c1 = new CircleWithExceptionTwo(5);
			CircleWithExceptionTwo c4 = new CircleWithExceptionTwo(0);
			CircleWithExceptionTwo c2 = new CircleWithExceptionTwo(-1);
			CircleWithExceptionTwo c3 = new CircleWithExceptionTwo(0);
			
		}catch(IllegalArgumentException errorMsg){
			System.out.println(errorMsg);
		}finally{
			System.out.println("Pasti Jalan");
		}
		
		System.out.println("Number of Objects created " + CircleWithExceptionTwo.getNumberOfObjects());
	}

}
