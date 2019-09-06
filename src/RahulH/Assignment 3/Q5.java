package assignment_4;

import java.util.Scanner;

public class Q5 {
	
	int reverse;
	int s = 0;
	
	void reverse(int number)
	{
		int temp = number;
		
		while (temp > 0 )
		{
			reverse = temp%10;
			temp = temp/10;
			s = s*10+reverse;
		}
		System.out.println("The reversed number is " +s);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = sc.nextInt();
		System.out.println("The entered number is: " +number);
		
		new Q5().reverse(number);
		sc.close();
	}

}
