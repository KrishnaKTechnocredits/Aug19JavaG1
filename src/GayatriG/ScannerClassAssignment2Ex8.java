//8) Find first differ index from given arrays 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex8 {
	void differIndex(int[] arr1, int[] arr2) {
		int cnt = 0;
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				cnt = 1;
				int diffarr1 = arr1[i];
				int diffarr2 = arr2[j];
				System.out.println(diffarr1 + ":" + diffarr2);
				System.out.println("Values are not matching at index -> " + i);
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("Arrays are equal");
		}
	}

	public static void main(String[] args) {
		// int[] arr1 = { 10, 2, 9, 14, 3 };
		// int[] arr2 = { 10, 2, 18, 14, 3 };
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
		ScannerClassAssignment2Ex8 scannerclassassignment2ex8 = new ScannerClassAssignment2Ex8();
		scannerclassassignment2ex8.differIndex(arr1, arr2);
	}
}
