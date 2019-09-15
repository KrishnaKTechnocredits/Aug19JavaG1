/*
 * 3) WAP to print Fibonacci series up to user required. Example:-  
 * Hint :-  1) Int num1 = 0, int num2 = 1  input :- 7  output: - 0 1 1 2 3 5 8 
 
 
 */
package VarshaT;

import java.util.Scanner;

public class A4_Program3 {
	void series(int num) {
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
		A4_Program3 a4_Program3 = new A4_Program3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no in series:");
		int num = sc.nextInt();
		a4_Program3.series(num);
		sc.close();

	}

}
