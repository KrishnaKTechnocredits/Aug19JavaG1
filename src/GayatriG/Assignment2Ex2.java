//2) Find duplicate number on Integer array in Java? 

package GayatriG;

public class Assignment2Ex2 {
	void duplicateNum(int[] input) {
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					flag = true;
					System.out.println("Duplicate value in the given array is: " + input[i]);
				}
			}
		}
		if (flag == false) {
			System.out.println("All values in the given array are different");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 2, 3, 6 };
		Assignment2Ex2 assignment2ex2 = new Assignment2Ex2();
		assignment2ex2.duplicateNum(arr);
	}
}
