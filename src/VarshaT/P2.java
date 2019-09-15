package VarshaT;

import java.util.Scanner;

public class P2 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
	}

	public static void main(String[] args) {
		P2 p2= new P2();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int n= sc.nextInt();
		p2.pattern(n);
		sc.close();
		
	}

}
