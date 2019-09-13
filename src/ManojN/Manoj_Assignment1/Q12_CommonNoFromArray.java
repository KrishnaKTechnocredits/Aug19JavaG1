/*
12) WAP to print common number from two different array
a. int array1 = {1, 3, 6, 9, 7}
b. int array2 = {2, 5, 6, 9, 8}
output Array :- {6, 9}
*/

package ManojN.Manoj_Assignment1;

public class Q12_CommonNoFromArray {
	static int count = 0;
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 6, 9, 7 };
		int arr2[] = { 2, 5, 6, 9, 8 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {
				if (arr1[i] == arr2[i]) {
					count = 1;
				}
			}
			if (count == 1) {
				System.out.println(arr1[i]);
				count = 0;
			}
		}
	}
}
