/*
3) Check if array contains a number in Java?
Hint: Your method should accept 2 parameters. Input array and number.
i/p :- arr[] = {2,5,9,7,4,6}
number :- 8
o/p :- number is not in arr.
 */
package ManojN.Manoj_Assignment1;
public class Q3checkNumberInArray {
	static void m1(int arr1[], int num){
		//int arr[] = {2,5,9,7,4,6};
		for(int i=0; i<arr1.length; i++){
			if (num==arr1[i]){
			System.out.println("num is same");
			
			}	else if (num!=arr1[i]){
				System.out.println("missing no from array : " + num);
				break;
			}
		}		
	}
	public static void main(String[] args) {
		int arr[] = {2,5,9,7,4,6};
		m1(arr,8);
	}
}
