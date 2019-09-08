package AtulS;

import java.util.Scanner;

public class P1 {

	static void printstar(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter now of rows:");
		int n = sc.nextInt();
		printstar(n);
		sc.close();

	}

}
