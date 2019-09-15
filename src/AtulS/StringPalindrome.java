//find to string is palindrome or not
package AtulS;

import java.util.Scanner;

public class StringPalindrome {

	void checkpalindrome(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (str.equals(rev))
			System.out.println("Given name " + str + " is palindrome");
		else
			System.out.println("Given name " + str + " is not palindrome");
	}

	public static void main(String[] args) {
		StringPalindrome str = new StringPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check:");
		str.checkpalindrome(sc.next());
		sc.close();
	}

}
