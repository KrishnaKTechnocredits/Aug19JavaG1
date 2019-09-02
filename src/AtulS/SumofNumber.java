//WAP to find sum of user given number
package AtulS;

import java.util.Scanner;

public class SumofNumber {

	int sum(int num) {
		int temp=0;
		int sum=0;
		while (num > 0) {
			temp = num % 10;
			sum += temp;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumofNumber sm = new SumofNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println(sm.sum(sc.nextInt()));
		sc.close();

	}

}
