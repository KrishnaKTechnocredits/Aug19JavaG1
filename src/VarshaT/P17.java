/*
 Draw below pattern
       *
     * *
   * * *
     * *
       *
 */
package VarshaT;

import java.util.Scanner;

public class P17 {
	void pattern(int n)
	{
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n){
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			}
			else
			{
				for(int k=1;k<=i-n;k++)
				{
					System.out.print("  ");
				}
				for(int j=2*n-1;j>=i;j--)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P17 p7 = new P17();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p7.pattern(n);
		sc.close();

	}


}
