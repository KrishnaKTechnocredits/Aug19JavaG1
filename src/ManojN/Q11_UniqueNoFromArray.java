/*
11) WAP to print unique number from the two different array
a. int array1 = {1, 3, 6, 9, 7},
b. int array2 = {2, 5, 6, 9, 8}
output Array :- {1, 3, 6, 9, 7, 2, 5, 8}
 */
package ManojN;

public class Q11_UniqueNoFromArray {
	static int count1 = 0;
	public static void main(String[] args) {
		int a1[] = { 1, 3, 6, 9, 7, 1, 3 };
		int a2[] = { 2, 5, 6, 9, 8, 5 ,8 };
		
		for ( int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
					if (a1[i] == a1[j]) {
						count1 = 1;
					}
			}	
			for (int k = i ; k < a2.length; k++){
				if ( a1[i] == a2[k]) {
					count1 = 1;
				}
			}
			if (count1 == 0) System.out.println(a1[i]);
		}
	}
}