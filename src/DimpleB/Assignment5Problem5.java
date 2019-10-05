/*
 Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. (use switch case)
 */
package DimpleB;

import java.util.Random;
import java.util.Scanner;

public class Assignment5Problem5 {	
	void showdayofweek(int num1)
	{
		int min=0;
		int max=7;
		Random r=new Random();
		int key=min+r.nextInt(max);
		switch(key)
		{
				case 1:
						System.out.println("Monday");
						break;
				case 2:
						System.out.println("Tuesday");
						break;
				case 3:
						System.out.println("Wednesday");
						break;
				case 4:
						System.out.println("Thursday");
						break;
				case 5:
						System.out.println("Friday");
						break;
				case 6: 
						System.out.println("Saturday");
						break;
				case 7:
						System.out.println("Sunday");
						break;
			}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		Assignment5Problem5 assignment5problem5=new Assignment5Problem5();
		assignment5problem5.showdayofweek(number1);
		sc.close();
	}

}
