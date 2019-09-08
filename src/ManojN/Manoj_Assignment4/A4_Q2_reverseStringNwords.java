package ManojN.Manoj_Assignment4;
public class A4_Q2_reverseStringNwords {
	static String input = "there is an apple";
	static String reverseArray() {
		String revArray = "";
		String arr[] = input.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
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
 * Q2) WAP to reverse a full String and particular word also. Example:- input =
 * “there is an apple” output = “elppanasiereht”
 */