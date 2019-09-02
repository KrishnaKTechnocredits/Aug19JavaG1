package ManojN.Manoj_Assignment3;

import java.util.Scanner;

public class A3_Q3_stringFrequency {

	static int acceptString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = sc.nextLine();
		for (;;) {
			System.out.println("Enter any character :");
			char ch = sc.next().charAt(0);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("count of " + ch + " : " + count);
		}
	}
	public static void main(String[] args) {
		acceptString();
	}
}
/*
 * Q3) WAP to find frequency of user defined character in user defined String a.
 * i.e. User String :- “electrical engineering” 
 * b. char value :- e 
 * c. count of e
 * :- 5
 */