/*
 Create Employee class and parameterized constructor with attributes empId , empName and salary. 
 Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality. 

  
 */



//Refer TestEmployee for class calling



package VarshaT;

public class Employee {
	private int empId;
	private float salary;
	private String empName;
	Employee(int empId,float salary, String empName)
	{
		this.empId=empId;
		this.salary=salary;
		this.empName=empName;
	}
	void display()
	{
		System.out.println("-------------DETAILS-------------");
		System.out.println("EMPLOYEE ID: "+empId);
		System.out.println("EMPLOYEE NAME: "+empName);
		System.out.println("SALARY "+salary);
	}

}
