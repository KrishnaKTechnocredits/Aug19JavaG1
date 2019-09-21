package VarshaT;

import java.util.Scanner;

public class P3 {

	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print(i+" ");
				else
					System.out.print((i+(j-1)*2+" "));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		P3 p3= new P3();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int n= sc.nextInt();
		p3.pattern(n);
		sc.close();
		
	}
}
