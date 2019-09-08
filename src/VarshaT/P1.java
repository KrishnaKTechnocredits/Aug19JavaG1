package VarshaT;

import java.util.Scanner;

public class P1 {

	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		
	}
	public static void main(String[] args) {
		P1 p1= new P1();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int n= sc.nextInt();
		p1.pattern(n);
		sc.close();
	}

}
