/*
8) Find first differ index from given arrays
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2
 */
package ManojN;
public class Q8_FirstDifferIndexFromArray {

	public static void main(String[] args) {
		int arr1[]= {10,2,9,14,4};
		int arr2[]= {10,2,18,14,3};
		for (int i=0; i<arr1.length; i++){
			if (arr1[i] != arr2[i]){
				System.out.println(i);
				break;
			}
		}
	}
}
