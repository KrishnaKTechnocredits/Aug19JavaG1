/*
 Draw below pattern
 		*
 	   * *
 	  *   *
 	 *******
 
 
 */
package VarshaT;

import java.util.Scanner;

public class Pattern9 {
	void pattern(int n) {
		for (int i = 0; i < n; i++) {
			int x = i;
			while (n - x - 1 != 0) {
				System.out.print(" ");
				x++;
			}
			for (int j = 0; j <= i; j++) {
				if (i < n - 1) {

					if (j == 0 || j == i)
						System.out.print("*" +" ");
					else
						System.out.print(" "+" ");
				} 
				else {
					if (j == n-1)

						System.out.print("*");
					else
						System.out.print("*"+"*");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern9 pattern9 = new Pattern9();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		pattern9.pattern(n);
		sc.close();

	}

}
