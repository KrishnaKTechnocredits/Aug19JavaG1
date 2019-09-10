//WAP to revers number
package AtulS;

import java.util.Scanner;

public class ReverseNumber {

	void reverse(int num) {
		int temp = num;
		int rev = 0;
		while (num > 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reversed number is:" + rev);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		reverse(num);

	}

	public static void main(String[] args) {
		ReverseNumber rev = new ReverseNumber();
		rev.input();

	}

}
