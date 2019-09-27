/*
 Find greater of two numbers using ternary operator..
 */

package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q02_DecisionMaking_LargestInTwo {
	void findlargestoftwo(int num1,int num2)
	{
		String answer1="Number "+num1+" is greater than "+num2;
		String answer2="Number "+num2+" is greater than "+num1;
		String t=num1>num2 ? answer1 :answer2;
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		Q02_DecisionMaking_LargestInTwo q2=new Q02_DecisionMaking_LargestInTwo();
		q2.findlargestoftwo(number1, number2);
		sc.close();
	}
}
