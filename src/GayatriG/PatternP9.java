/*    * 
 	 * * 
   	*   * 
   *     * 
  *********  */

package GayatriG;

public class PatternP9 {
	private static void patternPrinting(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			if (i < n)
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			else {
				for (int m = 1; m <= (n * 2) - 1; m++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		patternPrinting(5);
	}

}
