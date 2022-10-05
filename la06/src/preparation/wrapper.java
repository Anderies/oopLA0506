package preparation;

public class wrapper {
	
	public static void Wrapper() {
//		Converting
		Integer a = 3; //autoboxing (wrapper)
		int i = a.intValue(); //unboxing i.e converting Integer to int
		int j = a; //auto unboxing, now compiler will write a.intValue() internally
		
		System.out.println(a + " " + i + " " +j);
	}
	
	public static void wrapUnWrap() {
		//Converting int into Integer  
//		Making primitive data type into wrapper you can you valueOf or using Capitalize first letter in data type
		int a =  20;  
		Integer i = Integer.valueOf(a);//converting int into Integer explicitly (AutoBoxing)
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		
		  
		System.out.println("a is normal primitive integer: " + a + " while is become object "+ i + " "+j);  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Primitive		Wrapper
//		char			Character
//		short			Short
//		int				Integer
//		long			Long
//		float			Float
//		double			Double
//		Wrapper();
		wrapUnWrap();
	}

}
