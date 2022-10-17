package preparationS3;

// Class 1
// Helper Class
class Helper{
	
//	Static Method
	public static int sumStatic(int a, int b) {
//		Simply returning the sum
		return a+b;
	}
	
    // Non-static method
    public int sumNonStatic(int a, int b)
    {
        // Returning sum of numbers
        return a + b;
    }
}


// Class 2
public class staticNonStatic1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom values for integer
        // to be summed up
        int n = 3, m = 6;
        // Calling the static method of above class
        // and storing sum in integer variable
        
//        Helper.sumStatic();
        int s = Helper.sumStatic(n, m);
        Helper g = new Helper();
        
        // Calling above method to compute sum
        int s2 = g.sumNonStatic(n, m);
        // Print and display the sum
        System.out.print("sum is = " + s);
        System.out.print("sum is = " + s2);
        
	}

}
