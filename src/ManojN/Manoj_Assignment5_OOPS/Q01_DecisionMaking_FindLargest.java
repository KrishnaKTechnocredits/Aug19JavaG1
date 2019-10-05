/*
 Find the largest of three numbers using Logical And operator.
 */
package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q01_DecisionMaking_FindLargest {
	void findLargest(int num1,int num2,int num3)
	{
		if(num1>num2 &num1>num3)
		{
			System.out.println("Number "+num1+" is largest");
		}
		else if(num2>num1 &num2>num3)
		{
			System.out.println("Number "+num2+" is largest");
		}
		else
			System.out.println("Number "+num2+" is largest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		System.out.println("Enter number :");
		int number3=sc.nextInt();
		Q01_DecisionMaking_FindLargest q1=new Q01_DecisionMaking_FindLargest();
		q1.findLargest(number1, number2, number3);
		sc.close();
	}
}
