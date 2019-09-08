//6)Write a java program to check the equality of two arrays?  

package GayatriG;

public class Assignment2Ex6 {
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
		int[] arr1 = { 21, 57, 88, 37, 24 };
		int[] arr2 = { 21, 57, 11, 37, 24 };
		Assignment2Ex6 assignment2ex6 = new Assignment2Ex6();
		assignment2ex6.arrayEquality(arr1, arr2);
	}
}
