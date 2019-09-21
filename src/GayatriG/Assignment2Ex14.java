//14) WAP to print even number from the array 

package GayatriG;

public class Assignment2Ex14 {
	void evenNum(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				System.out.print(input[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 15, 24, 52, 49, 62, 10 };
		Assignment2Ex14 assignment2ex14 = new Assignment2Ex14();
		assignment2ex14.evenNum(arr);
	}
}
