//Q1) Find the missing number in integer array of 1 to 10?

package a2;

public class Q1ArrayMissingNumber {
	void m1(int arr2 []){
		// int arr2[]= {1,2,4,5,6};
		int count=0;
		for ( int i=0; i<arr2.length; i++){
			
			count=arr2[i]+1;
			if ( count != arr2[i+1] ){
				System.out.println("missing # : " + count);
				break;
			}
		}
	}
	public static void main(String[] args) {
		int arr1[]= {25,26,28,29};
		Q1ArrayMissingNumber q1 = new Q1ArrayMissingNumber();
		q1.m1(arr1);
	}
}
