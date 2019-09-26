//11) WAP to print unique number from the two different array 

package GayatriG;

import java.util.Scanner;

public class ScannerClassAssignment2Ex11 {

	void uniqueNum(int[] arr1, int[] arr2) {
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				System.out.print(arr1[i] + " " + arr2[j] + " ");
			} else {
				System.out.print(arr1[i] + " ");
			}
		}
	}

	/*
	 * static void getUniqueArray() { int[] arr1 = { 10, 13, -11, 0, 19, 13 };
	 * int[] arr2 = { 18, 11, 10, 29, 11 }; int[] outArray = new int[arr1.length
	 * + arr2.length]; int index = 0; for (int i = 0; i < arr1.length; i++) {
	 * boolean flag = false; for (int j = 0; j < index; j++) { if (arr1[i] ==
	 * outArray[j]) { flag = true; break; } } if (flag == false) {
	 * outArray[index] = arr1[i]; index++; } } for (int i = 0; i < arr2.length;
	 * i++) { boolean flag = false; for (int j = 0; j < index; j++) { if
	 * (arr2[i] == outArray[j]) { flag = true; break; } } if (flag == false) {
	 * outArray[index] = arr2[i]; index++; } } for (int i = 0; i < index; i++) {
	 * //if (outArray[i] != 0) System.out.println(outArray[i]); } }
	 */

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
		ScannerClassAssignment2Ex11 scannerclassassignment2ex11 = new ScannerClassAssignment2Ex11();
		scannerclassassignment2ex11.uniqueNum(arr1, arr2);

		// getUniqueArray();
	}
}
