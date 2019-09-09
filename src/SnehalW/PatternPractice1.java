package SnehalW;

import java.util.Scanner;

//Pattern Printing program2
public class PatternPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

}
