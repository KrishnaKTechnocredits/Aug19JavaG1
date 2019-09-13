//find to number is palindrome or not
package AtulS;

import java.util.Scanner;

public class NumberPalindrome {

	void checkpalindrome(int num) {
		int temp = 0;
		int rev = 0;
		int tempnum = num;
		while (tempnum > 0) {
			temp = tempnum % 10;
			rev = rev * 10 + temp;
			tempnum = tempnum / 10;
		}
		if (num == rev)
			System.out.println("Given " + num + " is palindrome");
		else
			System.out.println("Given " + num + " is not palindrome");
	}

	public static void main(String[] args) {
		NumberPalindrome num = new NumberPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:");
		num.checkpalindrome(sc.nextInt());
		sc.close();
	}

}
