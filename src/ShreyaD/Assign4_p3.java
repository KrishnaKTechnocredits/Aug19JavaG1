package ShreyaD;

import java.util.Scanner;

public class Assign4_p3 {

	void fibonacci(int num) {
		int num1 = 0, num2 = 1,num3=0;
		System.out.println("fibonacci series:");
		if (num == 1)
			System.out.println(num1);
		if (num == 2 || num > 2) {
			System.out.println(num1);
			System.out.println(num2);
			if (num > 2) {
				num=num-2;
				while(num!=0)
				{
					System.out.println(num1+num2);
					num3=num1+num2;
					num1=num2;
					num2=num3;
					num--;
				}
			}
		}

	}

	public static void main(String[] args) {
		Assign4_p3 Program3 = new Assign4_p3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no in series:");
		int num = sc.nextInt();
		Program3.fibonacci(num);
		sc.close();

	}

}
