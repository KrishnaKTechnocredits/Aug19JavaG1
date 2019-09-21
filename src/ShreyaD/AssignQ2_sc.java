package ShreyaD;

import java.util.Scanner;

public class AssignQ2_sc {
	void duplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println("duplicate no is:" + a[i]);
			}
		}
	}

	public static void main(String[] args) {

		AssignQ2_sc Q2 = new AssignQ2_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		sc.close();
		Q2.duplicate(num);
	}
}
