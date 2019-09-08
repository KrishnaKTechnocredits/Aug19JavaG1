//5)	WAP to reveres user given number

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex5 {
	static void reverse(String input) {
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			String str = String.valueOf(ch);
			int num = Integer.parseInt(str);
			System.out.print(num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		reverse(str);
	}
}
