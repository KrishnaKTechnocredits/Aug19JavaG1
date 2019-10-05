// Write a Java program that takes a year from user and print whether that year is a leap year or not 

package GayatriG;

import java.util.Scanner;

public class Assignment5Ex3 {
	static void leapYear(int input){
		if(input%4==0){
			System.out.println("Given year is leap year");
		}
		else
			System.out.println("Given year is not leap year");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		leapYear(year);
	}
}
