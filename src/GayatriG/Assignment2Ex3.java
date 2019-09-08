//3) Check if array contains a number in Java? 

package GayatriG;

public class Assignment2Ex3 {
	void containsNum(int[] arr, int num) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				cnt = 1;
				System.out.println("Given number " + num + " is present in the given array");
			}
		}
		if (cnt == 0) {
			System.out.println(num + " No not present");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 9, 7, 8 };
		int num = 9;
		Assignment2Ex3 assignment2ex3 = new Assignment2Ex3();
		assignment2ex3.containsNum(arr, num);
	}
}
