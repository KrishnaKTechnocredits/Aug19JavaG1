//Write a Java program that takes a year from user and print whether that year is a leap year or not
package AtulS;

import java.util.Scanner;

public class LeapYear {

	private void leapyear(int year) {
		if (year % 4 == 0)
			System.out.println("Given " + year + " year is leap year");
		else
			System.out.println("Given " + year + " year is not leap year");
	}

	private void input() { // take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		sc.close();
		leapyear(year);
	}

	public static void main(String[] args) {
		LeapYear year = new LeapYear();
		year.input();

	}

}
