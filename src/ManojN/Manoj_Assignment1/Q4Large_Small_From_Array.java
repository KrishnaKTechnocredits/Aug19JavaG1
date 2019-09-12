/*
 4) Largest and smallest number in unsorted array?
Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}.
 */

package ManojN.Manoj_Assignment1;

public class Q4Large_Small_From_Array {

	void m1(int a2[], int carrySum) {
		// int a2[]={2, 6, 9, 3, 11};
		for (int i = 0; i < a2.length; i++) {
			for (int j = i + 1; j < a2.length; j++) {
				if ((a2[i] + a2[j]) == carrySum) {
					System.out.println(a2[i] + "," + a2[j]);
					break;
				}
			}
		}
	}
public static void main(String[] args) {
		int a1[] = { 2, 6, 9, 3, 11 };
		int sum = 9;
		Q4Large_Small_From_Array q4 = new Q4Large_Small_From_Array();
		q4.m1(a1, sum);
	}

}
