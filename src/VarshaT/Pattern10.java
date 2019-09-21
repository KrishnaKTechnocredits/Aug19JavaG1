/*
Print below pattern

   * 
  * * 
 *   * 
*******
 *   * 
  * * 
   * 

 */
package VarshaT;

import java.util.Scanner;

public class Pattern10 {
	
	void pattern(int n) {
		for (int i = 0; i < n; i++) { //upper loop
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
		for (int i = n-2; i >= 0; i--) {  //lower loop
			int x = i;
			while (n - x - 1 != 0) {
				System.out.print(" ");
				x++;
			}
			for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i)
						System.out.print("*" +" ");
					else
						System.out.print(" "+" ");
			}
			System.out.println();
		}
}
	public static void main(String[] args) {
		Pattern10 pattern10 = new Pattern10();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n = sc.nextInt();
		pattern10.pattern(n);
		sc.close();

	}

}
