//4) Largest and smallest number in unsorted array? 

package GayatriG;

public class Assignment2Ex4 {
	int largeNum;

	void largestNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] > largeNum) {
				largeNum = input[i];
			}
		}
		System.out.println(largeNum + " is the largest no in the given array");
	}

	void smallestNum(int[] input) {
		int smallNum = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < smallNum) {
				smallNum = input[i];
			}
		}
		System.out.println(smallNum + " is the smallest number in the given array");
	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, -65, 55, 43, 1, 10 };
		Assignment2Ex4 assignment2ex4 = new Assignment2Ex4();
		assignment2ex4.largestNum(arr);
		assignment2ex4.smallestNum(arr);
	}
}
