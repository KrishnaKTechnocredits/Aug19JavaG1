//WAP to print unique number from given array store that numbers in new array
package AtulS;

import java.util.Scanner;

public class UniqueIntArray {

	public void userinput() { // take input from user
		int[] finalarr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		int frstarrsize = sc.nextInt();
		int[] frstarr = new int[frstarrsize];
		for (int i = 0; i < frstarr.length; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			frstarr[i] = sc.nextInt();
		}
		System.out.println("Enter size of second array");
		int scndarrsize = sc.nextInt();
		int[] scndarr = new int[scndarrsize];
		for (int i = 0; i < scndarr.length; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			scndarr[i] = sc.nextInt();
		}
		sc.close();
		finalarr = finduniquenum(frstarr, scndarr);// calling function to check
													// unique number
		for (int i = 0; i < finalarr.length; i++) {
			System.out.println(finalarr[i]);
		}
	}

	static private int[] finduniquenum(int[] arr, int[] arr1) {

		int[] finalarr = new int[arr.length + arr1.length];
		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			finalarr[i] = arr[i];
		}
		for (j = 0; j < arr1.length; j++) {
			boolean flag = false;
			for (i = 0; i < arr.length; i++) {
				if (arr1[j] == arr[i]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				finalarr[i] = arr1[j];
		}
		return finalarr;
	}

	public static void main(String[] args) {
		UniqueIntArray num = new UniqueIntArray();
		num.userinput();
	}

}
