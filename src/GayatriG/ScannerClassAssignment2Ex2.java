//2) Find duplicate number on Integer array in Java? 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex2 {
	void duplicateNum(int[] input) {
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					flag = true;
					System.out.println("Duplicate value in the given array is: " + input[i]);
				}
			}
		}
		if (flag == false) {
			System.out.println("All values in the given array are different");
		}
	}

	public static void main(String[] args) {
		// int arr[] = { 2, 4, 9, 2, 3, 6 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}
		ScannerClassAssignment2Ex2 scannerclassassignment2ex2 = new ScannerClassAssignment2Ex2();
		scannerclassassignment2ex2.duplicateNum(arr);
	}
}
