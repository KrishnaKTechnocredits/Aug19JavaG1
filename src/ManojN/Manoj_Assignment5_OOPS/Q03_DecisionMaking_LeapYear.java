/*
 Write a Java program that takes a year from user and print whether that year is a leap year or not
 */
package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q03_DecisionMaking_LeapYear {
	void checkleapyear(int year)
	{
		if(year%4==0)
		{
			System.out.println("Year "+year+" is a leap year.");
		}
		else
			System.out.println("Year "+year+" is not a leap year.");
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year :");
		int year=sc.nextInt();
		Q03_DecisionMaking_LeapYear q3=new Q03_DecisionMaking_LeapYear();
		q3.checkleapyear(year);
		sc.close();
	}
}
