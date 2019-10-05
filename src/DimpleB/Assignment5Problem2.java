/*
 Find greater of two numbers using ternary operator..
 */
package DimpleB;

import java.util.Scanner;

public class Assignment5Problem2 {
	void findlargestoftwo(int num1,int num2)
	{
		String answer1="Number "+num1+" is greater than "+num2;
		String answer2="Number "+num2+" is greater than "+num1;
		String t=num1>num2 ? answer1 :answer2;
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		Assignment5Problem2 assignment5problem2=new Assignment5Problem2();
		assignment5problem2.findlargestoftwo(number1, number2);
		sc.close();
	}
}
