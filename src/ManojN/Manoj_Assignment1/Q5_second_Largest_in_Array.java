//5)Write a java program to find second largest element in an array of integers?
package ManojN;

public class Q5_second_Largest_in_Array {

	
	static void m1(int a2[]) {
		// int a2[] = { 2, 6, 9, 3, 11 };
		int largest = a2[0];
		int secondLargest = a2[1];
		int s = 0;
		for (int i = 0; i < a2.length; i++) {
			for (int j = i + 1; j < a2.length; j++) {
				if (a2[i] > a2[j]) {
					largest = a2[i];
					secondLargest = a2[j];
				} else {
					largest = a2[j];
					secondLargest = a2[i];
					if (secondLargest > s){
						s= secondLargest;
					}
				}
			}  
		}
		System.out.println("largest = " + largest);
		System.out.println("secondLargest = " + s);
	}
	public static void main(String[] args) {
		int a1[] = { 2, 6, 9, 3, 11 };
		m1(a1);
	}
}
