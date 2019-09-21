//3) Check if array contains a number in Java? 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex3 {
	void containsNum(int[] arr, int num) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				cnt = 1;
				System.out.println("Given number " + num + " is present in the given array");
			}
		}
		if (cnt == 0) {
			System.out.println(num + " No not present");
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 4, 5, 9, 7, 8 };
		// int num = 9;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the no to compare :");
		int num = scanner.nextInt();

		ScannerClassAssignment2Ex3 scannerclassassignment2ex3 = new ScannerClassAssignment2Ex3();
		scannerclassassignment2ex3.containsNum(arr, num);
	}
}
