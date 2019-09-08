//11) WAP to print unique number from the two different array 

package GayatriG;

public class Assignment2Ex11 {
	void uniqueNum(int[] arr1, int[] arr2) {
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				System.out.print(arr1[i] + " " + arr2[j] + " ");
			} else {
				System.out.print(arr1[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 6, 9, 7 };
		int[] arr2 = { 2, 5, 6, 9, 8 };
		Assignment2Ex11 assignment2ex11 = new Assignment2Ex11();
		assignment2ex11.uniqueNum(arr1, arr2);
	}
}
