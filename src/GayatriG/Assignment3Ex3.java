//3)	WAP to find frequency of user defined character in user defined String

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex3 {
	static void findFreq(String input, char ch) {
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				cnt++;
			}
		}
		System.out.println("Frequency of " + ch + " is " + cnt);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = scanner.next();
		System.out.println("Enter the char to compare ");
		char ch = scanner.next().charAt(0);
		findFreq(input, ch);

	}
}
