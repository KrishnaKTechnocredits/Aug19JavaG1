
//WAP which fulfill below condition
//WAP to find positive and negative number from the given array  
//check the sum of individual.
package AtulS;

import java.util.Scanner;

public class PositiveNegative {

	static void num(int[] arr) {
		int positivenum = 0;
		int negativenum = 0;
		int positivesum = 0;
		int negativesum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negativenum = negativenum + 1;
				negativesum = negativesum + arr[i];
			} else {
				positivenum = positivenum + 1;
				positivesum = positivesum + arr[i];
			}
		}
		System.out.println("Total positive number is " + positivenum + " and negative no is " + negativenum
				+ " and sum of positive is " + positivesum + " and sum of negative is " + negativesum);
	}

	public static void main(String[] args) {
		int arrcnt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		arrcnt = sc.nextInt();
		int[] arr = new int[arrcnt];
		System.out.println("Enter positive and negative numbers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		num(arr);
	}

}
