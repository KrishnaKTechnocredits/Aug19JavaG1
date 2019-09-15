package VarshaT;
/*
 * 1) Draw below pattern 
 		*
 	   * *
 	  * * *
 	 * * * *
 	* * * * *
 */
import java.util.Scanner;

public class P11 {
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P11 p1 = new P11();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		p1.pattern(n);
		sc.close();

	}

}
