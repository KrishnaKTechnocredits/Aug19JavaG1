/*
 Draw below pattern
 	   *
     * *
   * * * 
 * * * *
 
 
 */
package VarshaT;

import java.util.Scanner;

public class P13 {

	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P13 p3 = new P13();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p3.pattern(n);
		sc.close();

	}


}
