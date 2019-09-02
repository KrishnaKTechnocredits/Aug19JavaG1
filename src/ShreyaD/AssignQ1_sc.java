package ShreyaD;

import java.util.Scanner;

public class AssignQ1_sc {
	void missing(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println("missing no is:" + a[i]);
		}
	}

	public static void main(String[] args) {
		AssignQ1_sc Q1 = new AssignQ1_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int num[] = new int[size];
		int num1[] = new int[size1];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num1.length; i++) {
			System.out.println("enter the number of 2nd array:");
			num1[i] = sc.nextInt();
		}
		sc.close();
		Q1.missing(num, num1);
	}

}
