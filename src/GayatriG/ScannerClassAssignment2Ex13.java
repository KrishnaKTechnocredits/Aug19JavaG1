//13) WAP to reveres array 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex13 {
	void arrayReverse(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(+arr[i] + "\t");
		}

	}

	public static void main(String[] args) {
		// int[] arr1 = { 2, 5, 6, 9, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Size of array is: " + size);
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the no at index " + i);
			arr[i] = sc.nextInt();
		}
		ScannerClassAssignment2Ex13 scannerclassassignment2ex13 = new ScannerClassAssignment2Ex13();
		scannerclassassignment2ex13.arrayReverse(arr);
	}
}
