//5)Write a java program to find second largest element in an array of integers? 

package GayatriG;

public class Assignment2Ex5 {
	void secondLargestNum(int[] input) {
		int largestNum = 0;
		int secLargestNum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > largestNum) {
				largestNum = input[i];
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] > secLargestNum && input[i] < largestNum) {
				secLargestNum = input[i];
			}
		}
		System.out.println(secLargestNum + " is the second largest number in the given array");
	}

	public static void main(String[] args) {
		int[] arr = { 101, 2, 6, 98, 34, 66, 79, 4, 100 };
		Assignment2Ex5 assignment2ex5 = new Assignment2Ex5();
		assignment2ex5.secondLargestNum(arr);
	}

}
