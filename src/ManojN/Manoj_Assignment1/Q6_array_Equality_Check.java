/*
 Q6)Write a java program to check the equality of two arrays?
Hint: Input Arrays : 
First Array : [21, 57, 11, 37, 24] 
Second Array : [21, 57, 11, 37, 23] Two Arrays Are Equal
 */
package ManojN.Manoj_Assignment1;

public class Q6_array_Equality_Check {
	static int count = 0;

	static void m1(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {
				count = 1;
				System.out.println(arr1[i] + " Two Arrays Are not Equal " + arr2[i]);

			}
		}
		if (count == 0)
			System.out.println("Two Arrays Are  Equal");
	}

	public static void main(String[] args) {
		int a1[] = { 21, 57, 11, 37, 24 };
		int a2[] = { 21, 57, 11, 37, 23 };
		m1(a1, a2);
	}
}
