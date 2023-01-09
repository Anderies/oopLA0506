package learningS1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!!");
//		System.out.print("(10.5 + 2 * 3) / (45 - 3.5) = ");
//		System.out.println((10.5 + 2 * 3) / (45 - 3.5));
		System.out.println("   J     A   V     V\t A");
		System.out.println("   J    A A   V   V\tA A");
		System.out.println("J  J   AAAAA   V V     AAAAA");
		System.out.println(" J J  A	    A   V     A     A");
		
		System.out.println("(Print a table) Write a program that displays the following table:");
		
		System.out.println("a	a^2	 a^3");
		System.out.println("1	1  	 1");
		System.out.println("2	4  	 8");
		System.out.println("3	9  	 27");
		System.out.println("4	10 	 64");
		
		System.out.println("(Compute expressions) Write a program that displays the result of:");
		
		System.out.println("9.5 X 4.5 - 2.5 X 3");
		System.out.println("-------------------");
		System.out.println("     45.5 - 3.5");
		System.out.println("         =");
		System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
		
		System.out.println("(Summation of a series) Write a program that displays the result of:");
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		
		System.out.println("(Approximate p) p can be computed using the following formula:");
		System.out.print("4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)) : ");
		System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7)
						   + (1 / 9) - (1 / 11) + (1 / 13)));
		
		System.out.println("(Area and perimeter of a circle) Write a program that displays the area and perimeter\r\n"
				+ "of a circle that has a radius of 5.5 using the following formulas:");
		System.out.println("Perimeter = ");
		System.out.println(2 * 5.5 * 3.14159);
		System.out.println("Area = ");
		System.out.println(5.5 * 5.5 * 3.14159);
		
		System.out.println("Write a program that displays the area and\r\n"
				+ "perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the following\r\n"
				+ "formula:");
		System.out.println("area = width x height");
		System.out.println("area = " + 4.5* 7.9);
		
		System.out.println("1.10 Assume that a runner runs 14 kilometers in 45 minutes\r\n"
				+ "and 30 seconds. Write a program that displays the average speed in miles per\r\n"
				+ "hour. (Note 1 mile is equal to 1.6 kilometers.)");
		System.out.println((14 / 45.30) / 1.6);
		
		System.out.println("1.11 Population projection");
		System.out.println("Current population: 312032486");
		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new immigrant every 45 seconds.");
		System.out.println("Yearly Population projection formula: ");
		System.out.println("Current population + ((births per year)");
		System.out.println("                   - (deaths per year)");
		System.out.println("                   + (new immigrants per year))");
		System.out.println("                   * year.");
		System.out.println("Year 1 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 1));
		System.out.println("Year 2 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 2));
		System.out.println("Year 3 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 3));
		System.out.println("Year 4 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 4));
		System.out.println("Year 5 projection: ");
		System.out.println(312032486 + (((31536000 / 7)
									 - (31536000 / 13)
									 + (31536000 / 45)) * 5));
		
		System.out.println("1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40\r\n"
				+ "minutes, and 35 seconds. Write a program that displays the average speed in\r\n"
				+ "kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)");
		
		System.out.println((24 / 100.35) / 1.6);
		
		
		
	}
}
