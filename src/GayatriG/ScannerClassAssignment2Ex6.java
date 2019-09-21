//6)Write a java program to check the equality of two arrays?  

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex6 {
	void arrayEquality(int[] input1, int[] input2) {
		int cnt = 0;
		for (int i = 0, j = 0; i < input1.length; i++, j++) {
			if (input1[i] != input2[j]) {
				cnt = 1;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("Two Arrays Are Equal ");
		} else {
			System.out.println("Two Arrays Are Not Equal ");
		}
	}

	public static void main(String[] args) {
		// int[] arr1 = { 21, 57, 88, 37, 24 };
		// int[] arr2 = { 21, 57, 11, 37, 24 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of arr1");
		int sizearr1 = sc.nextInt();
		System.out.println("Size of arr1 is: " + sizearr1);
		int[] arr1 = new int[sizearr1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter no of arr1 at index " + i);
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter size of arr1");
		int sizearr2 = sc.nextInt();
		System.out.println("Size of arr2 is: " + sizearr2);
		int[] arr2 = new int[sizearr2];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter no of arr2 at index " + i);
			arr2[i] = sc.nextInt();
		}
		ScannerClassAssignment2Ex6 scannerclassassignment2ex6 = new ScannerClassAssignment2Ex6();
		scannerclassassignment2ex6.arrayEquality(arr1, arr2);
	}
}
