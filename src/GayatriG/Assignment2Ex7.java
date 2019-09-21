//7) Find all pairs on integer array whose sum is equal to given number? 

package GayatriG;

public class Assignment2Ex7 {
	void sumOfNum(int[] input, int num) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length - 1; j++) {
				if (input[i] + input[j] == num) {
					System.out.println(input[i] + " + " + input[j] + " = " + num);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int sum = 7;
		Assignment2Ex7 assignment2ex7 = new Assignment2Ex7();
		assignment2ex7.sumOfNum(arr, sum);
	}
}
