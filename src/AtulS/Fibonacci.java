//WAP to find Fibonacci series for user defined number
package AtulS;

import java.util.Scanner;

public class Fibonacci {

	int factorial(int num) { // calculate factorial of given number
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	void fibonacciseries(int num) { // print fibonacci series upto given number
		int frst = 0;
		int second = 1;
		int next = 0;
		String tempstr = "";
		for (int i = 1; i <= num - 2; i++) {
			next = frst + second;
			tempstr = tempstr + " " + next;
			frst = second;
			second = next;
		}
		System.out.println("0 " + "1" + tempstr);
	}

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		fb.fibonacciseries(sc.nextInt());
		System.out.println("Enter number ");
		System.out.println(fb.factorial(sc.nextInt()));
		sc.close();
	}

}
