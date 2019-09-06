//10) Find max value at differed index 

package GayatriG;

public class Assignment2Ex10 {
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
		int[] arr1 = { 10, 2, 90, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		Assignment2Ex10 assignment2ex10 = new Assignment2Ex10();
		assignment2ex10.maxValue(arr1, arr2);
	}
}
