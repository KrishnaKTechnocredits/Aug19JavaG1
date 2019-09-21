package RahulH.PatternMatching;

import java.util.Scanner;

public class Q2 {
	
	void patter2(int rowSize)
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter row size");
		int rowSize = sc.nextInt();
		System.out.println("Entered row size is: " +rowSize);
		
		new Q2().patter2(rowSize);
		sc.close();
	}

}
