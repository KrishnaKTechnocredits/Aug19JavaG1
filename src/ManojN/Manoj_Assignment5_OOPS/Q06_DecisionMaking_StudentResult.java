/*
WAP to input student marks by condition :
Marks is greater than 0 and less than 50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100 Distinction
 */
package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q06_DecisionMaking_StudentResult {
	void showgrade(int score)
	{
		if(score>0 & score<50)
		{
			System.out.println("FAILED");
		}
		else if(score>=50 &score<=75)
		{
			System.out.println("FIRST CLASS");
		}
		else if(score>75 & score<100)
		{
			System.out.println("DISTINCTION");
		}
		else
			System.out.println("Unable to calculate grade!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks=sc.nextInt();
		Q06_DecisionMaking_StudentResult q6=new Q06_DecisionMaking_StudentResult();
		q6.showgrade(marks);
		sc.close();
	}
}
