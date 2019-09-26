/*
6. WAP to input student marks by condition : 
Marks is greater than 0 and less than 50--FAIILED 
Marks is greater than 50 and less than 75--1st Class 
Marks greater than 75 –and less than 100 Distinction 
*/

package VarshaT;

import java.util.Scanner;

public class A5_P6 {
	int marks;
	String grades;

	void input() {
		System.out.println("enter the marks");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		sc.close();
	}

	String grade() {

		if (marks > 0 && marks < 50)
			grades = "FAILED";
		else if (marks >= 50 && marks < 75)
			grades = "1ST Class";
		else if (marks >= 75 && marks <= 100)
			grades = "Distinction";
		else {
			System.out.println("please enter correc marks between 0to 100");
			return null;
		}
		return grades;
	}

	public static void main(String[] args) {
		A5_P6 a5_P6 = new A5_P6();
		a5_P6.input();
		if (a5_P6.grade() != null) {
			System.out.println("Grade:");
			System.out.println(a5_P6.grade());
		}

	}

}
