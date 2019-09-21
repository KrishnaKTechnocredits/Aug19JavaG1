//print Fibonacci series up to user required
package AtulS;

import java.util.Scanner;

public class FibonacciSeries {

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
		FibonacciSeries fb = new FibonacciSeries();
		System.out.println("Enter limit:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fb.fibonacciseries(num);
		sc.close();
	}

}
