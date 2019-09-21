package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q7 {
	
	void sum(int num)
	{
		int temp = num;
		int sum = 0;
		int reverse;
		
		while (temp > 0)
		{
			reverse = temp%10;
			temp = temp/10;
			sum = sum+reverse;
		}
		System.out.println("The sum is: " +sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		System.out.println("The entered number is: " +num);
		
		new Q7().sum(num);
		sc.close();
	}

}
