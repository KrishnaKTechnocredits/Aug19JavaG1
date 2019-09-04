//4)	WAP to find sum of user given number

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex4 {
	static void sum(String input) {
		int sumOfNum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String str = String.valueOf(ch);
			int num = Integer.parseInt(str);
			sumOfNum = sumOfNum + num;
		}
		System.out.println("Sum of given number:- " + sumOfNum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		sum(str);
	}
}
