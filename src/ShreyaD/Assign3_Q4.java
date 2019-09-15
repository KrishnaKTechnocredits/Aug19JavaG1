package ShreyaD;

import java.util.Scanner;

public class Assign3_Q4 {
	
	void sum(int n)
	{
		int sum=0;
		int a=0;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+a;
		}
		System.out.println("sum is;"+sum);
	}
public static void main(String []args)
{
	Assign3_Q4 Q4 = new Assign3_Q4();
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	Q4.sum(n);
	sc.close();
}
}
