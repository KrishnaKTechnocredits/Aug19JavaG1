package assignment_4;

import java.util.Scanner;

public class Q13 {
	
	int reverse;
	int sum=0;
	
	void Armstrong(int num)
	{
		int temp = num;
		
		while (num > 0)
		{
			reverse = num%10;
			num = num/10;
			sum = sum + (reverse*reverse*reverse);
		}
		if (sum == temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		System.out.println("The entered number is: ");
		
		new Q13().Armstrong(num);
		sc.close();
	}
}
