package Hemali;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
	System.out.println();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int x = sc.nextInt();
		sc.close();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	
	}
	
	
	
	 

}
