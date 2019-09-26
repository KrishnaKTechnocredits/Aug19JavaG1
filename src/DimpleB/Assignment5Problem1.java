/*
 Find the largest of three numbers using Logical And operator.
 */
package DimpleB;

import java.util.Scanner;

public class Assignment5Problem1 {
	
	void findlargestofthree(int num1,int num2,int num3)
	{
		if(num1>num2 &num1>num3)
		{
			System.out.println("Number "+num1+" is largest among user provided numbers.");
		}
		else if(num2>num1 &num2>num3)
		{
			System.out.println("Number "+num2+" is largest among user provided numbers.");
		}
		else
			System.out.println("Number "+num2+" is largest among user provided numbers.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		System.out.println("Enter number :");
		int number3=sc.nextInt();
		Assignment5Problem1 assignment5problem1=new Assignment5Problem1();
		assignment5problem1.findlargestofthree(number1, number2, number3);
		sc.close();
	}

}
