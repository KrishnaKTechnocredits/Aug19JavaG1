package GayatriG;

import java.util.Scanner;

public class Assignment3Ex1 {
	void sumOfPositiveNegativeNo(int[] input) {
		int posSum = 0;
		int negSum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				posSum = posSum + input[i];
			} else {
				negSum = negSum + input[i];
			}
		}
		System.out.println("Sum of positive No is : " + posSum);
		System.out.println("Sum of negative No is : " + negSum);

	}

	public static void main(String[] args) {
		// int[] arr={5, 6, -9, 14, -25, 6, 7, -14};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = scanner.nextInt();
		System.out.println("Array size is: " + size);
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("No at index " + i);
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		Assignment3Ex1 assignment3ex1 = new Assignment3Ex1();
		assignment3ex1.sumOfPositiveNegativeNo(arr);
	}
}
