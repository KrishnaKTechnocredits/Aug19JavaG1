//12)  WAP to print common number from two different array 

package GayatriG;

public class Assignment2Ex12 {
	void commonNum(int[] arr1, int[] arr2) {
		boolean flag = false;
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] == arr2[j]) {
				flag = true;
				System.out.print(arr1[i] + ",");

			}
		}
		if (flag == false) {
			System.out.println("All value are different");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 6, 9, 7 };
		int[] arr2 = { 2, 5, 6, 9, 8 };
		Assignment2Ex12 assignment2ex12 = new Assignment2Ex12();
		assignment2ex12.commonNum(arr1, arr2);
	}
}
