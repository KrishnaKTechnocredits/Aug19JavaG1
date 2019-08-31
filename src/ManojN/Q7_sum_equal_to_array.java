/*
7) Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, 
you need to write a program to find all elements in the array 
whose sum is equal to the given number. Remember, the array may 
contain both positive and negative numbers, so your solution 
should consider that. 
Input:2, 4, 3, 5, 7, 8, 9 
Given sum:7 
Integer numbers, whose sum is equal to value:7 
(2, 5) (4, 3)
 */
package a2;
public class Q7_sum_equal_to_array {
	static void m1(int a[],int sum){
		int temp=0;
		for (int i=0; i<a.length; i++){
			for (int j=i+1; j<a.length; j++){
				temp=(a[i]+a[j]);
				if(sum==temp){
					System.out.println(a[i] + " , " +a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]={2, 4, 3, 5, 7, 8, 9};
		m1(a,7);
		
	}
}
