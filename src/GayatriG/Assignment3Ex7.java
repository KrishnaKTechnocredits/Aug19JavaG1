//7)	WAP to find factorial  for user defined number

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex7 {
	static void factorial(int input) {
		int fact = 1;
		/*
		 * for(int i=input;i>0;i--){ fact=fact*i; }
		 */
		while (input > 0) {
			fact = fact * input;
			input--;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		int num = sc.nextInt();
		factorial(num);
	}
}
