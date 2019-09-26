//WAP to reveres user given number
package AtulS;

import java.util.Scanner;

public class ReverseNumber {

String reverse(int num) {
		int temp = 0;
		String revnum = "";
		while (num > 0) {
			temp = num % 10;
			revnum = revnum + temp;
			num = num / 10;
		}
		return revnum;
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		reverse(num);

	}


	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println(rn.reverse(sc.nextInt()));
		sc.close();
	}
}
