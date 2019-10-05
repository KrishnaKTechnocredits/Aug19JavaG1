package SnehalW;

import java.util.Scanner;
//3. Write a Java program that takes a year from user and print whether that year is a leap year or not(Divisible by 400 and 4 and not by 100)

public class Leapyear {
	int year;
	boolean flag = false;

	void Checkyear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		year = sc.nextInt();

		if (year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Year " + year + " is a Leap Year");
		} else {
			System.out.println("Year " + year + " is not a Leap Year");
		}
		sc.close();
	}

	public static void main(String[] args) {
		Leapyear ly = new Leapyear();
		ly.Checkyear();

	}
}