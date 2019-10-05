package RahulH.CoreJavaAssignment3.ClassesAndObjects;

import java.util.Scanner;

public class TestSquare extends Square{
	
	TestSquare(int side)
	{
		super(side);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 'side' value");
		int side = sc.nextInt();
		System.out.println("'Side' value is: " +side);
		
		Square s = new TestSquare(side);
		sc.close();
	}
}
