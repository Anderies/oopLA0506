package LearningS13;

public class partOne {
	public static void main(String[] args) {
//		cthBreakOne();
//		cthBreakTwo();
//		cthContinueOne();
		whichMoreAccurate();
	}

	public static void whichMoreAccurate() {
//		System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
		
//		System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);
//		displays 1.0 / 3.0 is 0.3333333333333333
		int x = 1;
		int x2 = 2;
		
		
//		(x != 1)
//		if(x === x2) {
//			
//		}
//		System.out.println(x == !(x2 == x));
		
		
	}
 
	public static void cthBreakOne() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void cthBreakTwo() {
		for (int i = 0; i < 3; i++) {
			one: { // label one
				two: { // label two
					three: { // label three
						System.out.println("i=" + i);
						if (i == 0)
							break one; // break to label one
						if (i == 1)
							break two; // break to label two
						if (i == 2)
							break three; // break to label three
					}
					System.out.println("after label three");
				}
				System.out.println("after label two");
			}
			System.out.println("after label one");
		}
	}

	public static void cthContinueOne() {
		for (int i = 0; i < 10; i++) {
			if(i == 6) {
				System.out.println();
				// using continue keyword
				// to skip the current iteration
				continue;
			}
			System.out.println(i);
		}
	}
}
