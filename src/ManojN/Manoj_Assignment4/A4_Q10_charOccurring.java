package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q10_charOccurring {
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
Q10) WAP to character occurring in user defined String and Character
Example :-
InputString :- hello how are you harsh?
Input char :- h
Output:- char is : h and number of occurrence = 4
*/
