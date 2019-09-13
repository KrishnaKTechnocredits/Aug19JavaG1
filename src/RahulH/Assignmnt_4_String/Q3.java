package assignment_4_String;

import java.util.Scanner;

public class Q3 {
	
	void checkFibonacci(int fibo)
	{
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+ " " +num2);
		
		for (int i=2; i<fibo; i++)
		{
			int num3 = num1+num2;
			System.out.print(" " +num3);
			num1=num2;
			num2=num3;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number: ");
		int fibo = sc.nextInt();
		System.out.println("The entered number is: " +fibo);
		
		new Q3().checkFibonacci(fibo);
		sc.close();
	}

}
