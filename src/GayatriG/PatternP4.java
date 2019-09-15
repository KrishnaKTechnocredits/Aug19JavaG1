package GayatriG;

public class PatternP4 {
	private static void downReversePyramid(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		downReversePyramid(5);
	}
}
