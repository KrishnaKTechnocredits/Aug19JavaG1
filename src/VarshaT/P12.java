/*
 Draw below pattern
 *
 * *
 * * *
 * * * *
 
  */
package VarshaT;

import java.util.Scanner;

public class P12 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P12 p2 = new P12();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p2.pattern(n);
		sc.close();

	}



}
