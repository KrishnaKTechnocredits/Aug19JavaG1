//separate digits and characters from the user define string
package AtulS;

import java.util.Scanner;

public class DigitCharacter {

	void digitchar(String str) { // separate digits and character
		String newstr = "", digits = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digits = digits + str.charAt(i);
			} else {
				newstr = newstr + str.charAt(i);
			}

		}
		System.out.println(digits);
		System.out.println(newstr);
	}

	void input() { // Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.next();
		sc.close();
		digitchar(str);
	}

	public static void main(String[] args) {
		DigitCharacter dg = new DigitCharacter();
		dg.input();
	}

}
