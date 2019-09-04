//13)	WAP to find number is Armstrong or not.

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex13 {
	static void noArmstrong(String input) {
		int sum = 0;
		int no = Integer.parseInt(input);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String str = String.valueOf(ch);
			int integer = Integer.parseInt(str);
			sum = sum + (integer * integer * integer);
		}
		if (no == sum) {
			System.out.println("No is Armstrong");
		} else {
			System.out.println("No is not Armstrong");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String num = sc.next();
		noArmstrong(num);
	}
}
