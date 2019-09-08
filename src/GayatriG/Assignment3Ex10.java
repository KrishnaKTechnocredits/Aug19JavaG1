//10)	WAP to sum of two array

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex10 {
	static void sumOfElements(int[] input1, int[] input2) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < input1.length; i++) {
			sum1 = sum1 + input1[i];
		}
		for (int i = 0; i < input2.length; i++) {
			sum2 = sum2 + input2[i];
		}
		int sum = sum1 + sum2;
		System.out.println("Sum of elements in the given arrays is" + sum);
	}

	public static void main(String[] args) {
		// int[] arr1={1, 5, 9, 3, 7};
		// int[] arr2={1, 7, 9, 3};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1 ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			System.out.println("Enter the value at index " + i);
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of array2 ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			System.out.println("Enter the value at index " + i);
			arr2[i] = sc.nextInt();
		}
		sumOfElements(arr1, arr2);
	}
}
