/*
 Draw below pattern
 *
 * *
 * * *
 * * * *
 
 
 */
package VarshaT;

import java.util.Scanner;

public class Pattern2 {

	void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern2 pattern2= new Pattern2();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern2.pattern(n);
		sc.close();

	}

}
