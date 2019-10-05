package SnehalW;

import java.util.Scanner;

//Find the largest of three numbers using Logical And operator.
public class Largest3number {
	int a, b, c;

	void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		b = sc.nextInt();
		System.out.println("Enter 3rd number :");
		c = sc.nextInt();

		if ((a > b) && (a > c))
			System.out.println("1st number is greater");
		if ((b > a) && (b > c))
			System.out.println("2nd number is greater");
		if ((c > a) && (c > b))
			System.out.println("3rd number is greater");
		sc.close();
	}

	public static void main(String[] args) {
		Largest3number ln = new Largest3number();
		ln.sum();
	}
}
