package assignment_4;

import java.util.Scanner;

public class Q7 {
	
	void Factorial(int n)
	{
		int a=1;
		for (int i=1; i<=n; i++)
		{
			a=a*i;
		}
		System.out.println(n + " factorial is " + a);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value on N: ");
		int n = sc.nextInt();
		System.out.println("You entered: " +n);
		
		//int n = 5;
		
		new Q7().Factorial(n);
		sc.close();
	}

}
