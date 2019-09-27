package VarshaT;

import java.util.Scanner;

public class TestSqaure {
	private float side;
	TestSqaure()
	{
		System.out.println("enter the side of the sqaure:");
		Scanner sc= new Scanner(System.in);
		side= sc.nextFloat();
		sc.close();
	}

	public static void main(String[] args) {
		TestSqaure testSqaure= new TestSqaure();
		Square  square= new Square(testSqaure.side);
		square.square();
	}

}
