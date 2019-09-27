//find greater of 2 no's using ternary number
package VarshaT;

import java.util.Scanner;

public class A5_P2 {
	int x,y,z,max,max1;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 no's to be comapred:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
	}
	void compare(int x, int y, int z)
	{
		max=x>y?x:y;
		max1=max>z?max:z;
		System.out.println("max number:"+max1);
	}
	public static void main(String[] args) {
		A5_P2 a5_P2 = new A5_P2();
		a5_P2.input();
		a5_P2.compare(a5_P2.x, a5_P2.y, a5_P2.z);
	}

}
