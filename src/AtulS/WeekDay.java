//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
//and displays the name of the weekday. (use switch case)
package AtulS;

import java.util.Scanner;

public class WeekDay {

	private void generateRandomNumber() { // It generate random number between
											// 1-7. However it is generating
											// number beyond 7 also. please
											// check it
		int num = (int) (Math.random() * 8);

	}

	private int input() { // take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 1-7:");
		int num = sc.nextInt();
		sc.close();
		return num;

	}

	private String displayWeekday() { // display weekday name
		int num = input();
		switch (num) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return "Invalid input";
		}
	}

	public static void main(String[] args) {
		WeekDay day = new WeekDay();
		System.out.println(day.displayWeekday());
	}

}
