/*
Draw below pattern
* * * * *
* * * *
* * *
* *
* 


 */
package VarshaT;

import java.util.Scanner;

public class P14 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P14 p4 = new P14();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p4.pattern(n);
		sc.close();

	}
}
