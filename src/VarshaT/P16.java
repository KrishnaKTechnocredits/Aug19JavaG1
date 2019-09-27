/*
 Draw below pattern
 
*
* *
* * *
* *
* 

 */


package VarshaT;

import java.util.Scanner;

public class P16 {
	void pattern(int n) {
	for (int i = 1; i <= 2 * n - 1; i++) {
			if(i<=n){
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}
		else{
		for (int k = 2 * n - 1; k >= i; k--) {
			System.out.print("* ");
		}
	}

	System.out.println();

	}}

	public static void main(String[] args) {
		P16 p6 = new P16();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the max no of rows");
		int n = sc.nextInt();
		p6.pattern(n);
		sc.close();

	}

}
