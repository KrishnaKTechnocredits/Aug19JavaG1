//13) WAP to reveres array 

package GayatriG;

public class Assignment2Ex13 {
	void arrayReverse(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(+arr[i] + "\t");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 6, 9, 8 };
		Assignment2Ex13 assignment2ex13 = new Assignment2Ex13();
		assignment2ex13.arrayReverse(arr1);
	}
}
