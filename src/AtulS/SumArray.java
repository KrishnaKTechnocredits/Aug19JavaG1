//WAP to sum of two array
package AtulS;

import java.util.Scanner;

public class SumArray {

	static int summation(int[] arr, int[] arr1) // calculate sum
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int j = 0; j < arr1.length; j++) {
			sum += arr1[j];
		}
		return sum;
	}

	void userinput() // take input from user
	{
		int frstarrsize;
		int secndarrsize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		frstarrsize = sc.nextInt();
		int[] frst = new int[frstarrsize];
		for (int i = 0; i < frst.length; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			frst[i] = sc.nextInt();
		}
		System.out.println("Enter size of array");
		secndarrsize = sc.nextInt();
		int[] scnd = new int[secndarrsize];
		for (int i = 0; i < scnd.length; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			scnd[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Sum of given array is: " + summation(frst, scnd));

	}

	public static void main(String[] args) {
		SumArray sum = new SumArray();
		sum.userinput();

	}

}
