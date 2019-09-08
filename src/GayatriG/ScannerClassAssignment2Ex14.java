//14) WAP to print even number from the array 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex14 {
	void evenNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				System.out.print(input[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 15, 24, 52, 49, 62, 10 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}
		ScannerClassAssignment2Ex14 scannerclassassignment2ex14 = new ScannerClassAssignment2Ex14();
		scannerclassassignment2ex14.evenNum(arr);
	}
}
