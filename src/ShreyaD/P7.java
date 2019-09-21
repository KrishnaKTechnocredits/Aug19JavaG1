package ShreyaD;

import java.util.Scanner;

public class P7 {

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
		P7 p7 = new P7();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p7.pattern(n);
		sc.close();

	}
}
