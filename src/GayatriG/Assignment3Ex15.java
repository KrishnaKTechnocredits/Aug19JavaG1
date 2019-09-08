//15)	WAP to find string which has length more than 7 characheter.

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex15 {
	static void maxLengthChar(String[] input) {
		String maxLength = null;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 6) {
				System.out.print(input[i] + "\t");
			}
		}
	}

	public static void main(String[] args) {
		// String[] arr={"krishna", "maulik", "harsh", "swapnil", "gayatri"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value at index " + i);
			arr[i] = sc.next();
		}
		maxLengthChar(arr);
	}
}
