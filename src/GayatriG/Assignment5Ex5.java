//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
//and displays the name of the weekday. (use switch case) 

package GayatriG;

import java.util.Scanner;

public class Assignment5Ex5 {
	static void displayWeekday(int input){
		switch(input){
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid input");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of weekday");
		int weekday=sc.nextInt();
		displayWeekday(weekday);
	}
	
}
