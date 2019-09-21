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

public class Pattern4 {
	void pattern(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Pattern4 pattern4= new Pattern4();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern4.pattern(n);
		sc.close();
	}

}
