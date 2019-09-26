package SnehalW;

import java.util.Scanner;

/*5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays 
the name of the weekday. (use switch case)*/

public class Weekday {
	static int num;
	static String weekday;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weekday number between 1 to 7");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(" 1 : Sunday");
			break;
		case 2:
			System.out.println(" 2 : Monday");
			break;
		case 3:
			System.out.println(" 3 : Tuesday");
			break;
		case 4:
			System.out.println(" 4 : Wednesday");
			break;
		case 5:
			System.out.println(" 5 : Thursday");
			break;
		case 6:
			System.out.println(" 6 : Friday");
			break;
		case 7:
			System.out.println(" 7 : Saturday");
			break;
		default:
			System.out.printf("number should be between 1 to 7");
		}
	}
}
