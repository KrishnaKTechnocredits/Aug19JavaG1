package ShreyaD;

import java.util.Scanner;

public class AssignQ11_sc {

	void Unique(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int cnt = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
		}

		for (int i = 0; i < b.length; i++) {
			cnt = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j])
					cnt++;
			}

			if (cnt == 0) {
				c[k] = b[i];
				k++;
			}
		}
		for (int i = 0; i < k; i++)
			System.out.println(c[i]);

	}

	public static void main(String[] args) {
		AssignQ11_sc Q11 = new AssignQ11_sc();
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
		Q11.Unique(num, num1);
	}
}
