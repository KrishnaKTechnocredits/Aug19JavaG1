package GayatriG;

public class PatternP1 {
	private static void patternPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		patternPyramid(5);
	}

}
