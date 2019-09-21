//1) Find the missing number in integer array of 1 to 10? 

package GayatriG;

public class Assignment2Ex1 {
	void missingNum(int[] input) {
		int missNum = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i + 1] - input[i] != 1) {
				missNum = input[i + 1] - 1;
				System.out.println("Missing No in the given array is: " + missNum);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		Assignment2Ex1 assignment2ex1 = new Assignment2Ex1();
		assignment2ex1.missingNum(arr);
	}

}
