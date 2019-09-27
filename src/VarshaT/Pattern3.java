/*
 Draw below pattern
 	   *
     * *
   * * * 
 * * * *
 
 
 */





package VarshaT;

import java.util.Scanner;

public class Pattern3 {

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
	}
	public static void main(String[] args) {
		Pattern3 pattern3= new Pattern3();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n= sc.nextInt();
		pattern3.pattern(n);
		sc.close();

	}

}
