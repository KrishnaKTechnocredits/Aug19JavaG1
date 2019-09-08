/*
 WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321
reverse  of actual number :- 12321

 */



package VarshaT;

import java.util.Scanner;

public class Program11 {
	void reverse(int num)
	{
		int x=0,sum=0,num1;
		num1= num;
		while(num>0)
		{
			x=num%10;
			num/=10;
			sum=sum*10+x;
		}
		if(num1== num)
			System.out.println("number is plaindrome");
		else
			System.out.println("number is plaindrome");
		
	}

	public static void main(String[] args) {
		Program11 program11= new Program11();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		program11.reverse(num);
		sc.close();


	}

}
