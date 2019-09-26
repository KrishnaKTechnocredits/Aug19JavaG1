package Hemali;

import java.util.Scanner;

public class Problem4 {

	static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int num1=num%10;
			rev=rev*10+num1;
			num/=10;
		}
		
		System.out.println("Reverse number is : " +rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		reverse(number);

	}

}
