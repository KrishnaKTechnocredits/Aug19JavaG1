package assignment_4_String;

import java.util.Scanner;

public class Q6 {
	
	void factorial(int num )
	{
		int sum = 1;
		for (int i=num; i>=1; i--)
		{
			sum = sum*i;
		}
		System.out.print(num + " Factoral is: " +sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num = sc.nextInt();
		System.out.println("Entered number is: " +num);
		
		new Q6().factorial(num);
		sc.close();
	}

}
