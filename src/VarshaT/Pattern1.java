package VarshaT;

/*
 * 1) Draw below pattern 
 		*
 	   * *
 	  * * *
 	 * * * *
 	* * * * *
 */

import java.util.Scanner;

public class Pattern1 {

	void pattern(int n) {
		for (int i = 0; i < n; i++) {
			int x = i;
			while (n - x - 1 != 0) {
				System.out.print(" ");
				x++;
			}
			for (int j = 0; j <= i; j++) {
				
				System.out.print("*" + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern1 pattern1 = new Pattern1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		pattern1.pattern(n);
		sc.close();
	}

}
