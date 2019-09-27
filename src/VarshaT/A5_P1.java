//Find the largest of three numbers using logical and operator

package VarshaT;

import java.util.Scanner;

public class A5_P1 {
	int x, y, z;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 no's to be comapred:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
	}

	void compare(int x, int y, int z) {
		System.out.println("Max number:");
		if (x > y && x > z) {
			System.out.println(x);
		} 
		else if (x > y && x < z)
			System.out.println(z);
		else if (x < y && x > z)
			System.out.println(y);
		else if (y > z)
			System.out.println(y);
		else
			System.out.println(z);
	}
	public static void main(String[] args) {
		A5_P1 a5_P1 = new A5_P1();
		a5_P1.input();
		a5_P1.compare(a5_P1.x, a5_P1.y, a5_P1.z);
	}

}
