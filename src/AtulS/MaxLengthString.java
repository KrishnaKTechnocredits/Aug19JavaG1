//WAP to find max length String from the given array
package AtulS;

import java.util.Scanner;

public class MaxLengthString {

	static String getstring(String[] arr) {
		int max = 0;
		String maxstr = "";
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i].length()) {
				max = arr[i].length();
				maxstr = arr[i];
			}
		}
		return maxstr;
	}

	public static void main(String[] args) {
		int arrcnt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		arrcnt = sc.nextInt();
		String[] arr = new String[arrcnt];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter strings:");
			arr[i] = sc.nextLine();
		}
		sc.close();
		System.out.println(getstring(arr));

	}

}
