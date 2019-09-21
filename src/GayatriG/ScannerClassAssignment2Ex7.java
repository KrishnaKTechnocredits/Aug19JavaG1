//7) Find all pairs on integer array whose sum is equal to given number? 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex7 {
	void sumOfNum(int[] input, int num) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length - 1; j++) {
				if (input[i] + input[j] == num) {
					System.out.println(input[i] + " + " + input[j] + " = " + num);
				}
			}
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		// int sum = 7;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter sum: ");
		int sum = scanner.nextInt();
		ScannerClassAssignment2Ex7 scannerclassassignment2ex7 = new ScannerClassAssignment2Ex7();
		scannerclassassignment2ex7.sumOfNum(arr, sum);
	}
}
