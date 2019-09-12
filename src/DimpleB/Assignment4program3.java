/*
 WAP to print Fibonacci series up to user required.
Example:-
Hint :-
1) Int num1 = 0, int num2 = 1
input :- 7
output: - 0 1 1 2 3 5 8
 */
package DimpleB;

import java.util.Scanner;

public class Assignment4program3 {
	
	void fibonacciseries(int inputnum)
	{
		int num1=0;
		int num2=1;
		int fib=0;
		int i=0; 
		for(i=1;i<=inputnum;i++)
		{
			System.out.print(num1+" ");
			fib=num1+num2;
			num1=num2;
			num2=fib;
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number for fibonacci series:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Assignment4program3 p3=new Assignment4program3();
		p3.fibonacciseries(number);
		sc.close();
	}
}
