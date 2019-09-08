package RahulH;

import java.util.Scanner;

public class P1 {
	
	void starPattern(int rowsize, int colsize)
	{
		for (int i=1; i<=rowsize; i++)
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
		System.out.println("Please enter the row size: ");
		int rowsize = sc.nextInt();
		System.out.println("Entered row size is: " +rowsize);
		
		System.out.println("Please enter the column size: ");
		int colsize = sc.nextInt();
		System.out.println("Entered column size is: " +colsize);
		
		new P1().starPattern(rowsize, colsize);
	}
	

}
