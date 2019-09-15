package ShreyaD;

import java.util.Scanner;

public class Assign3_Q5 {
	void reverse_no(int n)
	{
		int reverse =0;
		
		while(n!=0)
		{
			int a=n%10;
			n=n/10;
			reverse=reverse*10+a;
		}
		System.out.println("reverse number is :"+reverse);
	}

	public static void main(String []args)
	{
		Assign3_Q5 Q5 = new Assign3_Q5();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		Q5.reverse_no(n);
		sc.close();
	}
}
