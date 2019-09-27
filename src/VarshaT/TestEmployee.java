/*
 Create Employee class and parameterized constructor with attributes empId , empName and salary. 
 Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality. 

  
 */
package VarshaT;

import java.util.Scanner;

public class TestEmployee {
	private int empId;
	private float salary;
	private String empName;
	TestEmployee()
	{
		System.out.println("enter the details of an employee");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee id:");
		empId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name:");
		empName= sc.nextLine();
		System.out.println("enter salary:");
		salary=sc.nextFloat();
		sc.close();
	}
	public static void main(String[] args) {
		TestEmployee testEmployee= new TestEmployee();
		Employee emp= new Employee(testEmployee.empId,testEmployee.salary,testEmployee.empName);
		emp.display();
		

	}

}
