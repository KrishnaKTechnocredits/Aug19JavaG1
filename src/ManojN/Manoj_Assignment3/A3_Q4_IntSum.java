package ManojN.Manoj_Assignment3;

import java.util.Scanner;

public class A3_Q4_IntSum {
	static int mod, input, sum = 0;
	static int acceptInt() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		input = sc.nextInt();
		sc.close();
		while (input > 0) {
			mod = input % 10;
			sum = sum + mod;
			input = input/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of digits : "+ acceptInt());
	}
}
/*
Q4)	WAP to find sum of user given number.
a.	Input:- 159753
b.	Sum of given number:- 30
String str = 159753;
*/