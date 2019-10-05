package Hemali;

import java.util.Scanner;

public class A5_Calculator {
	double addition(double num1,double num2)
	{
		double ans=num1+num2;
		return ans;
	}
	double subtract(double num1,double num2)
	{
		double ans=num1-num2;
		return ans;
	}
	
	double multiplication(double num1,double num2)
	{
		double ans=num1*num2;
		return ans;
	}
	double division(double num1,double num2)
	{
		double ans=num1/num2;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5_Calculator calculator=new A5_Calculator();
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		
		int option=1;
		
		double ans;
		while(option!=0)
		{
	System.out.println("Enter the option: \n 1.Addition\n 2.Subtraction \n 3.Multiplication \n 4.Division");
	option=sc.nextInt();	
	switch(option)
		{
		case 1:
			System.out.println("Enter two number : ");
			 num1=sc.nextDouble();
			 num2=sc.nextDouble();
			ans=calculator.addition(num1,num2);
			System.out.println("Addition is "+ans);
			break;
		case 2:
			System.out.println("Enter two number : ");
			 num1=sc.nextDouble();
			 num2=sc.nextDouble();
			ans=calculator.subtract(num1,num2);
			System.out.println("Subtraction is "+ans);
			break;
		case 3:
			System.out.println("Enter two number : ");
			 num1=sc.nextDouble();
			 num2=sc.nextDouble();
			ans=calculator.multiplication(num1,num2);
			System.out.println("Multiplication is "+ans);
			break;
		case 4 :
			System.out.println("Enter two number : ");
			 num1=sc.nextDouble();
			 num2=sc.nextDouble();
			ans=calculator.division(num1,num2);
			System.out.println("Division is "+ans);
		case 0:
			System.out.println("Program Terminated");
			System.exit(0);
		}
		}

	}

}
