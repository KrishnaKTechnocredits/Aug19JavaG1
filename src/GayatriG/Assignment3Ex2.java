//2)	WAP to find max length String from the given array

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex2 {
	static void maxLength(String[] input) {
		int maxLen = input[0].length();
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLen) {
				maxLen = input[i].length();
			}
		}
		System.out.println("Max length String from the given array is " + maxLen);
	}

	public static void main(String[] args) {
		String[] arr = { "all the best Gayatri", "technocredits", "", "maharashtra" };
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the size of Array : "); int
		 * size=scanner.nextInt(); System.out.println("Array size is: "+size);
		 * String[] arr=new String[size];
		 * 
		 * for(int i=0;i<arr.length;i++){
		 * System.out.println("String at index "+i); arr[i]=scanner.next(); }
		 */
		maxLength(arr);
	}
}
