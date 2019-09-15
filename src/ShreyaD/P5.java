package ShreyaD;

import java.util.Scanner;

public class P5 {

	void pattern(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=n-i*1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("please enter the no");
			int n = sc.nextInt();
			P5 p = new P5();
			p.pattern(n);
			sc.close();
}
}
