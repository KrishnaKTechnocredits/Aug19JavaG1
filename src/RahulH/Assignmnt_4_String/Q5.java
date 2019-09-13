package assignment_4_String;

import java.util.Scanner;

public class Q5 {
	
	void armstrong(int num)
	{
		int temp = num;
		int r;
		int sum = 0;
		int length = String.valueOf(num).length();
		//System.out.println("The length is: " +length);
		
		while (temp > 0)
		{
			r = temp%10;
			temp = temp/10;
			if (length == 3)
			{
				sum = sum + (r*r*r);
			}
			if (length == 4)
			{
				sum = sum + (r*r*r*r);
			}
			if (length == 5)
			{
				sum = sum + (r*r*r*r*r);
			}
		}
		//System.out.println("The sum is: " +sum);
		
		if (num == sum)
		{
			System.out.println(num + " is armstrong");
		}else
		{
			System.out.println(num + " not armstrong");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter 3 digit number");
		int num = sc.nextInt();
		//System.out.println("Entered 3 digit number is: " +num);
		
		new Q5().armstrong(num);
		sc.close();
	}

}
