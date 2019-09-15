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

public class Pattern6 {
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
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		Pattern6 pattern6= new Pattern6();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern6.pattern(n);
		sc.close();


	}

}
