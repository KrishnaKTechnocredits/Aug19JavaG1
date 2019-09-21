package SnehalW;

import java.util.Scanner;

/*WAP to print factorial number
Example:-
input:- 5
output:- 120
hint:- 1*2*3*4*5=120*/
public class Factorial_A4_6 {

	public static void main(String[] args) {
		int fact=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
		}
	}