//6)	WAP to find reverse max length string 

package GayatriG;

public class Assignment3Ex6 {

	static void reverseOfMaxLength(String[] input) {
		String maxLengthString = null;
		int maxLength = input[0].length();
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLength) {
				// maxLength=input[i].length();
				maxLengthString = input[i];
			}
		}
		System.out.println("Output Max length string :- " + maxLengthString);
		for (int i = maxLengthString.length() - 1; i >= 0; i--) {
			System.out.print(maxLengthString.charAt(i));
		}
	}

	public static void main(String[] args) {
		String[] arr = { "all the best", "Technocredits", "", "Gayatri", "I love My India" };
		reverseOfMaxLength(arr);
	}
}