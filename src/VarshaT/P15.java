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

public class P15 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P15 p5 = new P15();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p5.pattern(n);
		sc.close();

	}

}
