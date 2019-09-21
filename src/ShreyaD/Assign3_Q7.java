package ShreyaD;

import java.util.Scanner;

public class Assign3_Q7 {
	void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is :"+fact);
			
	}

	public static void main(String[] args) {
		Assign3_Q7 Q7 = new Assign3_Q7();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		Q7.factorial(n);
		sc.close();
	}
}
