//WAP to find given string is palidrome or not 

package GayatriG;

public class Assignment4Ex11 {
	static void palindrome(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if (rev.equals(input))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

	public static void main(String[] args) {
		String str = "racecar";
		palindrome(str);
	}
}
