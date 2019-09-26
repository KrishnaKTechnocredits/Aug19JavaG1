//Find the largest of three numbers using Logical And operator
package AtulS;

import java.util.Scanner;

public class LargeNumber {

	private int largenumber(int[] arr) { // find largest number
		if (arr[0] > arr[1] && arr[0] < arr[2])
			return arr[2];
		else if (arr[0] < arr[1] && arr[0] > arr[2])
			return arr[1];
		else
			return arr[0];
	}

	private void input() { // take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:");
		int[] arr = new int[3];
		for (int i = 1; i <= 3; i++) {
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
		LargeNumber num = new LargeNumber();
		num.input();
	}

}
