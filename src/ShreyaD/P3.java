package ShreyaD;

import java.util.Scanner;

public class P3 {

	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("please enter the no");
			int n = sc.nextInt();
			P3 p = new P3();
			p.pattern(n);
			sc.close();
}
}
