//12)	WAP to find word is palindrome or not ?

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex12 {
	static void stringPalindrome(String input) {
		int cnt = 0;
		for (int i = 0, j = input.length() - 1; i < input.length() / 2; i++, j--) {
			if (input.charAt(i) == input.charAt(j)) {
				cnt++;
			}
		}
		if (cnt > 0) {
			System.out.println("Given word is palindrome");
		} else {
			System.out.println("Word not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		stringPalindrome(str);
	}
}
