//WAP to find average of user given array
package AtulS;

import java.util.Scanner;

public class AverageArray {

	float Average(int[] arr) {
		int sum = 0;
		float avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		return avg;
	}

	public static void main(String[] args) {
		int arrsize;
		Scanner sc = new Scanner(System.in);
		AverageArray Avg = new AverageArray();
		System.out.println("Enter number of elements");
		arrsize = sc.nextInt();
		int[] arr = new int[arrsize];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " number:");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Average of given input arrays is:" + Avg.Average(arr));

	}

}
