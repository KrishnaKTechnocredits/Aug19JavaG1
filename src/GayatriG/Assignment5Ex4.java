//Write a Java Program and create Calculator using switch statement 

package GayatriG;

import java.util.Scanner;

public class Assignment5Ex4 {
	static void calculator(double x, double y, char op) {

		switch (op) {
		case 'a':
			double a = x + y;
			System.out.println("Addition of given numbers is " + a);
			break;
		case 's':
			double s = x - y;
			System.out.println("Substarction of given numbers is " + s);
			break;
		case 'm':
			double m = x * y;
			System.out.println("Multiplication of given numbers is " + m);
			break;
		case 'd':
			double d = x / y;
			System.out.println("Division of given numbers is " + d);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd value");
		double num2 = sc.nextDouble();
		System.out.println("Enter the operation to perform(add:a,sub:s,mul:m,div:d");
		char operation = sc.next().charAt(0);
		calculator(num1, num2, operation);
	}
}
