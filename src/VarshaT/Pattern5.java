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

public class Pattern5 {
	void pattern(int n)
	{
		for(int i=n;i>0;i--)
		{
			int x=i;
			for(int j=0;j<i;j++)
			{
				while(n-x!=0)
				{
					System.out.print(" ");
					x++;
				}
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern5 pattern5= new Pattern5();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern5.pattern(n);
		sc.close();

	}

}
