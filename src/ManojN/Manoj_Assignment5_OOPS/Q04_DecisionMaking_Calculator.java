/*
 Write a Java Program and create Calculator using switch statement
 */
package ManojN.Manoj_Assignment5_OOPS;

import java.util.Scanner;

public class Q04_DecisionMaking_Calculator {
	void calculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		System.out.println("Enter operation :");
		String op=sc.next();
		sc.close();
		switch(op)
		{
				case "+" :
							System.out.println(number1+" "+op+" "+number2+" = "+(number1+number2));
							break;
				case "-":
							System.out.println(number1+" "+op+" "+number2+" = "+(number1-number2));
							break;
				case "*":
						System.out.println(number1+" "+op+" "+number2+" = "+(number1*number2));
							break;
				case "/":
						System.out.println(number1+" "+op+" "+number2+" = "+(number1/number2));
							break;
				default:
							System.out.println("Please enter valid operation!");
							break;
			}
	}

	public static void main(String[] args) {
	
		Q04_DecisionMaking_Calculator q4=new Q04_DecisionMaking_Calculator();
		q4.calculator();
		
	}
}
