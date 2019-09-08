//12)  WAP to print common number from two different array 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex12 {
	void commonNum(int[] arr1, int[] arr2) {
		boolean flag = false;
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] == arr2[j]) {
				flag = true;
				System.out.print(arr1[i] + ",");

			}
		}
		if (flag == false) {
			System.out.println("All value are different");
		}
	}

	public static void main(String[] args) {
		// int[] arr1 = { 1, 3, 6, 9, 7 };
		// int[] arr2 = { 2, 5, 6, 9, 8 };
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
		ScannerClassAssignment2Ex12 scannerclassassignment2ex12 = new ScannerClassAssignment2Ex12();
		scannerclassassignment2ex12.commonNum(arr1, arr2);
	}
}
