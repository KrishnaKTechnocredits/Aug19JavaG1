/*
Q13) WAP to reveres array
a. int inputArray = {5, 6, 9, 10, 14, 63}
b. outputArray = {63, 14, 10, 9, 6, 5}
 */
package ManojN.Manoj_Assignment1;
public class Q13_reveres_array {

	public static void main(String[] args) {
		int a[]={5, 6, 9, 10, 14, 63};
		for (int i=(a.length-1);i>=0; i--){
			System.out.print(a[i]+",");
		}
	}
}
