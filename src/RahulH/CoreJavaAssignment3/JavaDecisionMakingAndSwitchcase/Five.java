package RahulH.CoreJavaAssignment3.JavaDecisionMakingAndSwitchcase;

import java.util.Scanner;

public class Five {
	
	void weekname(int number)
	{
		switch (number){
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
			
		default:
			System.out.println("We have only 7 days in a week");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		System.out.println("The entered number is: " +number);
		
		Five f = new Five();
		f.weekname(number);
		sc.close();
	}

}
