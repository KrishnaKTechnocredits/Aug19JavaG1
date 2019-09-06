package RahulH.Assignment_3;

import java.util.Scanner;

public class Q4 {
	
	int reverse = 0;
	int sum = 0;
	
	void sum(int number)
	{
		int temp = number;
		
		while(temp > 0)
		{
			reverse = temp%10;
			temp = temp/10;
			sum = sum + reverse;
		}
		System.out.println("The sum is: " +sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the size of array: ");
		int number = sc.nextInt();
		System.out.println("Entered number is: " + number);	
		
		new Q4().sum(number);
		sc.close();
	}
}
