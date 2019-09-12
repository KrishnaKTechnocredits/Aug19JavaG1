//WAP to find given string is palindrome or not
package AtulS;

import java.util.Scanner;

public class StringPalindrome { // check if string is palindrome or not

	boolean palindrome(String str) {
		char[] chArr = str.toCharArray();
		boolean flag = false;
		for (int i = 0; i < chArr.length / 2; i++) {
			if (chArr[i] == (str.charAt(str.length() - 1 - i))) {
				flag = true;
			}
		}
		return flag;
	}

	void input() { // Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		if (palindrome(str))
			System.out.println("Given string is palindrom");
		else
			System.out.println("Given string is not palindrom");
		sc.close();
	}

	public static void main(String[] args) {
		StringPalindrome obj = new StringPalindrome();
		obj.input();

	}

}
