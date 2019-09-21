//Separate word and number
package AtulS;

import java.util.Scanner;

public class SeparateNumChar {

	String[] strArr;

	void checkdigits(String[] strArr) { // separate digits and character
		String digits = "", newstr = "";
		// strArr = new String[str.length];
		for (int i = 0; i < strArr.length; i++) {
			if (Character.isDigit(strArr[i].charAt(0))) {
				digits = digits + "," + strArr[i];
			} else {
				newstr = newstr + "," + strArr[i];
			}
		}

		System.out.println(digits.replaceFirst(",", ""));
		System.out.println(newstr.replaceFirst(",", ""));

	}

	void input() { // Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements:");
		int elementcnt = sc.nextInt();
		String[] str = new String[elementcnt];
		for (int i = 0; i < elementcnt; i++) {
			System.out.println("Enter " + (i + 1) + " element");
			str[i] = sc.next();
		}
		checkdigits(str);
		sc.close();
	}

	public static void main(String[] args) {
		SeparateNumChar sc = new SeparateNumChar();
		sc.input();
	}

}
