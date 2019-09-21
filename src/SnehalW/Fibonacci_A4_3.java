package SnehalW;

import java.util.Scanner;

/*1)
WAP to print Fibonacci series up to user required. 
Int num1 = 0, int num2 = 1
input :- 7
output: - 0 1 1 2 3 5 8*/

public class Fibonacci_A4_3 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for fibonacci :");
		int fn = sc.nextInt();
		System.out.print(num1 +" "+num2);
		for(int i=2; i<fn; i++)
		{
			int num3 = num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}
	}
}
