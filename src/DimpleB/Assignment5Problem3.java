/*
 Write a Java program that takes a year from user and print whether that year is a leap year or not
 */
package DimpleB;

import java.util.Scanner;
public class Assignment5Problem3 {
	
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
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year :");
		int year=sc.nextInt();
		Assignment5Problem3 assignment5problem3=new Assignment5Problem3();
		assignment5problem3.checkleapyear(year);
		sc.close();
	}
}
