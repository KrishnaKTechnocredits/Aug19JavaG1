//Find greater of two numbers using ternary operator
package AtulS;

import java.util.Scanner;

public class GreaterNumber {

	private int largenumber(int[] arr) { // find largest number
		int max = arr[0] > arr[1] ? arr[0] : arr[1];
		return max;
	}

	private void input() { // take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int[] arr = new int[2];
		for (int i = 1; i <= 2; i++) {
			arr[i - 1] = sc.nextInt();
		}
		sc.close();
		display(largenumber(arr));
	}

	public void display(int num) // display largest number
	{
		System.out.println("Largest number is:" + num);
	}

	public static void main(String[] args) {
		GreaterNumber num = new GreaterNumber();
		num.input();

	}

}
