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

public class Pattern7 {
	void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			int x=i;
			for(int j=0;j<=i;j++)
			{
				while(n-x-1!=0)
				{
					System.out.print(" ");
					System.out.print(" ");
					x++;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			int x=i;
			for(int j=0;j<i;j++)
			{
				while(n-x!=0)
				{
					System.out.print(" ");
					System.out.print(" ");
					x++;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern7 pattern7= new Pattern7();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern7.pattern(n);
		sc.close();


	}

}
