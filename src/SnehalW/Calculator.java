package SnehalW;

import java.util.Scanner;

//4. Write a Java Program and create Calculator using switch statement

public class Calculator {
	static int  a, b, answer;
	static String op;
    static char operator;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a = sc.nextInt();
		System.out.println("Enter 2nd number");
		b = sc.nextInt();
		System.out.println("Enter operator");
		op = sc.next();
		operator = op.charAt(0);

		switch (operator) {
		case '+':
			answer = a + b;
			break;
		case '-':
			answer = a - b;
			break;
		case '*':
			answer = a * b;
			break;
		case '/':
			answer = a / b;
			break;
		default:
			System.out.printf("Please enter correct operator");
			
		}
		System.out.printf("Result : " + a +  operator  + b + " = " + answer);
	}
}
