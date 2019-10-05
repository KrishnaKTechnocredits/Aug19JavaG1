/*
 Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. (use switch case)
 */
package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q05_DecisionMaking_Weekday {
	void showdayofweek(int num1)
	{
		switch(num1)
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
				default:
					System.out.println("Please enter number between 1 to 7");
					break;
			}	
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number number between 1 to 7 :");
		int number1=sc.nextInt();
		Q05_DecisionMaking_Weekday q5=new Q05_DecisionMaking_Weekday();
		q5.showdayofweek(number1);
		sc.close();
	}
}
