//5)Write a java program to find second largest element in an array of integers? 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex5 {
	void secondLargestNum(int[] input) {
		int largestNum = input[0];
		int secLargestNum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > largestNum) {
				secLargestNum = largestNum;
				largestNum = input[i];
			}
			// }
			// for (int i = 0; i < input.length; i++) {
			else if (input[i] > secLargestNum && input[i] < largestNum) {
				secLargestNum = input[i];
			}
		}
		System.out.println(secLargestNum + " is the second largest number in the given array");
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 6, 98, 34, 66, 79, 4 };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		System.out.println("Size of array is " + size);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array at index " + i);
			arr[i] = scanner.nextInt();
		}
		ScannerClassAssignment2Ex5 scannerclassassignment2ex5 = new ScannerClassAssignment2Ex5();
		scannerclassassignment2ex5.secondLargestNum(arr);
	}

}
