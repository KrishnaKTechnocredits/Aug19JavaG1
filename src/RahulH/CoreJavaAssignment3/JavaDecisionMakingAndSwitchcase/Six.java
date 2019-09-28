package RahulH.CoreJavaAssignment3.JavaDecisionMakingAndSwitchcase;

import java.util.Scanner;

public class Six {
	
	void StudentMarks(int marks)
	{
		if (marks <=50)
			System.out.println("failed");
		else if(marks >0 && marks<=75)
			System.out.println("1st class");
		else if (marks >= 76 && marks <=100)
			System.out.println("Distinction");
		else
			System.out.println("Marks entered above 100");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter marks");
		int marks = sc.nextInt();
		System.out.println("Marks entered: " +marks);
		
		Six s = new Six();
		s.StudentMarks(marks);
		sc.close();
	}

}
