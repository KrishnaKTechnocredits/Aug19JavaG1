package ShreyaD;

import java.util.Scanner;

public class P4 {

	void pattern(int n)
	{
		for(int i=n;i>=1;i--)
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
			P4 p = new P4();
			p.pattern(n);
			sc.close();
}

}
