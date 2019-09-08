//10) Find max value at differed index 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex10 {
	void maxValue(int[] arr1, int[] arr2) {
		int maxNum = 0;
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				if (arr1[i] > arr2[j]) {
					maxNum = arr1[i];
				} else {
					maxNum = arr2[j];
				}
				System.out.println("Values are not matching at index -> " + i + "\nFrom ( " + arr1[i] + " , " + arr2[j]
						+ ") max value is " + maxNum);
			}
		}

	}

	public static void main(String[] args) {
		// int[] arr1 = { 10, 2, 90, 14, 3 };
		// int[] arr2 = { 10, 2, 18, 14, 3 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array 1");
		int sizearr1 = sc.nextInt();
		System.out.println("Size of arr1 is: " + sizearr1);
		int arr1[] = new int[sizearr1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter no of arr1 at index " + i);
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of array 2");
		int sizearr2 = sc.nextInt();
		System.out.println(sizearr2);
		int arr2[] = new int[sizearr2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter no of arr2 at index " + i);
			arr2[i] = sc.nextInt();
		}

		ScannerClassAssignment2Ex10 scannerclassassignment2ex10 = new ScannerClassAssignment2Ex10();
		scannerclassassignment2ex10.maxValue(arr1, arr2);
	}
}
