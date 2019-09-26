//8) Find first differ index from given arrays 

package GayatriG;

public class Assignment2Ex8 {
	void differIndex(int[] arr1, int[] arr2) {
		int cnt = 0;
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				cnt = 1;
				int diffarr1 = arr1[i];
				int diffarr2 = arr2[j];
				System.out.println(diffarr1 + ":" + diffarr2);
				System.out.println("Values are not matching at index -> " + i);
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("Arrays are equal");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		Assignment2Ex8 assignment2ex8 = new Assignment2Ex8();
		assignment2ex8.differIndex(arr1, arr2);
	}
}
