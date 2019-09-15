/*	* 
   * * 
  *   * 
 *     * 
  *   *
   * *
    *
*/
package GayatriG;

public class PatternP10 {
	private static void patternPrinting(int n) {
		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			} else {
				for (int j = 1; j <= i - n; j++) {
					System.out.print(" ");
				}
				for (int j = n * 2 - 1; j >= i; j--) {
					if (j == n * 2 - 1 || j == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patternPrinting(5);
	}
}
