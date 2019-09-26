package ShreyaD;

import java.util.Scanner;

public class P2 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
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
			P2 p = new P2();
			p.pattern(n);
			sc.close();
}

}
