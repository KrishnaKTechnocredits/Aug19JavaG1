package GayatriG;



public class P2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				int a = 0;
				if (j == 1) {
					System.out.print(i + " ");
				} else {
					a = i + (j - 1) * 2;
					System.out.print(a + " ");
				}

			}
			System.out.println();
		}
	}
}
