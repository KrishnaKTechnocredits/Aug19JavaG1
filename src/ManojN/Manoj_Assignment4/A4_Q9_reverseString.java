package ManojN.Manoj_Assignment4;
public class A4_Q9_reverseString {
	static String input = "hello good morning to all";
	static String reverseArray() {
		String revArray = "";
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			reverseString(arr[i]);
		}
		return revArray;
	}
	static void reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.print(rev);
	}
	public static void main(String[] args) {
		System.out.println("Reverse of  '"+ input + "' is");
		reverseString(reverseArray());
	}
}
/*
Q9)WAP to revers the word.
Example:-
input :- hello good morning to all
output:-ollehdooggninromotlla
*/