//Factorial
package AtulS;

import java.util.Scanner;

public class Factorial {

	void factorial(int num) { // calculate factorial of given number
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		factorial(num);

	}

	public static void main(String[] args) {
		Factorial fc = new Factorial();
		fc.input();

	}

}
