//Sum of Digits
package AtulS;

import java.util.Scanner;

public class SumOfDigits {

	void sum(int num) {
		int temp = 0;
		int sum = 0;
		while (num > 0) {
			temp = num % 10;
			sum += temp;
			num = num / 10;
		}
		System.out.println(sum);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		sum(num);

	}

	public static void main(String[] args) {
		SumOfDigits sd = new SumOfDigits();
		sd.input();

	}

}
