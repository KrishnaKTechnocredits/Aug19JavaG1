//Armstrong number
package AtulS;

import java.util.Scanner;

public class ArmstrongNumber {

	void checkarmstrong(int num) {
		int temp = num;
		int sum = 0;
		int temp1 = 0;
		while (num > 0) {
			temp1 = num % 10;
			num = num / 10;
			sum += temp1 * temp1 * temp1;
		}
		if (temp == sum)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is not Armstrong");
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		checkarmstrong(num);

	}

	public static void main(String[] args) {
		ArmstrongNumber num = new ArmstrongNumber();
		num.input();
	}

}
