package RahulH.CoreJavaAssignment3.JavaDecisionMakingAndSwitchcase;

import java.util.Scanner;

public class Third {
	
	int LastLeapYear = 2016;
	void CheckLeapYear(int year)
	{
		if (year % 4 ==0)
		{
			System.out.println(year + " is leap year");
		}else
		{
			System.out.println(year + " is NOT a leap year");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the year: ");
		int year = sc.nextInt();
		System.out.println("The entered year is: " +year);
		
		Third t = new Third();
		t.CheckLeapYear(year);
		sc.close();
	}

}
