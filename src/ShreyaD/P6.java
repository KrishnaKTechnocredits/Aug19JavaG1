package ShreyaD;

import java.util.Scanner;

public class P6 {

	void pattern(int n) {		
		int var = 1;
		for (int i = 1; i <= (n * 2) - 1; i++) {
			if (i <= n) {
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
			} else {
				for (int j = (n - 1); j >=var; j--) {
					System.out.print("* ");
				}
				var++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int n = sc.nextInt();
		P6 p = new P6();
		p.pattern(n);
		sc.close();
	}
}
