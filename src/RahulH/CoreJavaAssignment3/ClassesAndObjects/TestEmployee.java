package coreJavaAssignment3.classAndObjects;

import java.util.Scanner;

public class TestEmployee extends Employee{
	
	TestEmployee(int emp, String name, int sal)
	{
		super (emp, name, sal);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter empID, EmpName, Salary");
		int empID = sc.nextInt();
		String EmpName = sc.next();
		int salary = sc.nextInt();
		
		TestEmployee TE = new TestEmployee(empID, EmpName, salary);
		sc.close();
	}
}
