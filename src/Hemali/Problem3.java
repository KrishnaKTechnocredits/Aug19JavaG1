package Hemali;

import java.util.Scanner;

public class Problem3 {
	static void febonacii(int n)
	{
		int num1=0;
		int num2=0;
		int num3=1;
		
		for(int i=1;i<=n;i++)
		{
			num1=num2;
			num2=num3;
			num3=num1+num2;
			
			System.out.print(num1+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series number : ");
		int n=sc.nextInt();
		febonacii(n);
	}

}
