package ShreyaD;

import java.util.Scanner;

public class Assign3_Q11 {
	void palindrome(int n)
	{
		int x=0;
		int sum=0;
		int n1;
		n1=n;
		while(n>0)
		{
			x=n%10;
			n=n/10;
			sum=sum*10+x;
		}
		if(n1==n)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		Assign3_Q11 Q11 = new Assign3_Q11();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		Q11.palindrome(n);
		sc.close();
	}
}
