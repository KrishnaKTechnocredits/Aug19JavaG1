package RahulH;

import java.util.Scanner;

public class p2 {
	
	void numPattern(int rowSize, int colSize)
	{
		for (int i=1; i<=rowSize; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the row size: ");
		int rowSize = sc.nextInt();
		System.out.println("Entered row size is: " +rowSize);
		
		System.out.println("Please enter the column mize: ");
		int colSize = sc.nextInt();
		System.out.println("Entered column size is: " +colSize);
		
		new p2().numPattern(rowSize, colSize);
	}

}
