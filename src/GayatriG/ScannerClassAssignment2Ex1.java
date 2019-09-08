//1) Find the missing number in integer array of 1 to 10? 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex1 {
	void missingNum(int[] input) {
		int missNum = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i + 1] - input[i] != 1) {
				missNum = input[i + 1] - 1;
				System.out.println("Missing No in the given array is: " + missNum);
			}
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}

		ScannerClassAssignment2Ex1 scannerclassassignment2ex1 = new ScannerClassAssignment2Ex1();
		scannerclassassignment2ex1.missingNum(arr);
	}

}
