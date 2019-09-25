package SnehalW;

import java.util.Scanner;

/*6. WAP to input student marks by condition :
Marks is greater than 0 and less than 50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100 Distinction*/
public class Marks {
	static int marks;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		marks = sc.nextInt();
		sc.close();

		if (marks > 0 && marks < 50)
			System.out.println("FAIL");
		if (marks >= 50 && marks < 75)
			System.out.println("1st class");
		if (marks >= 75 && marks < 100)
			System.out.println("Distinction");
	}

}
