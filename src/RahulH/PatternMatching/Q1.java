package RahulH.PatternMatching;

import java.util.Scanner;

public class Q1 {
	
	void pattern(int rowSize, int columnSize)
	{
		for (int i = 1; i<=rowSize; i++)
		{
			for (int j=columnSize; j>=1; j--)
			{
				if (j>i)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please row size");
		int rowSize = sc.nextInt();
		System.err.println("Row size is: " +rowSize);
		
		System.out.println("Please column size");
		int columnSize = sc.nextInt();
		System.out.println("Column size is: " +columnSize);
		
		new Q1().pattern(rowSize, columnSize);
		sc.close();
		
	}
}
