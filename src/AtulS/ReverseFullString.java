//WAP to reveres a full String and particular word also
package AtulS;

import java.util.Scanner;

public class ReverseFullString {

	static void reverse(String str) {
		String revstr = "";
		if (str.contains(" ")) {
			str = str.replaceAll(" ", "");
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Reversed String is:" + revstr);
	}

	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		reverse(str);
		sc.close();
	}

	public static void main(String[] args) {
		input();
	}

}
