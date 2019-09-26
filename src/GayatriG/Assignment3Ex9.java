//9)	WAP to find average of user given array

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex9 {
	static void average(int[] input) {
		float avg = 0;
		float sum = 0;
		float cnt = 0;

		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
			cnt++;
		}
		avg = sum / cnt;
		System.out.println("Average of the given numbers in the string is" + avg);
	}

	public static void main(String[] args) {
		// int[] arr={14, 32, 19, 14, 78,36};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value at index " + i);
			arr[i] = sc.nextInt();
		}
		average(arr);

	}
}
