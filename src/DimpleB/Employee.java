/*
 Create Employee class and parameterized constructor with attributes empId , empName and salary. Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality.
 */

package DimpleB;

public class Employee {
	private int empId;
	
	private String empName;
	
	private float salary;

	Employee(int id,String name,float sal)
	{
		if((name!=" " || name !=null) & sal>0 & id >0)
		{
			this.empId=id;
			this.empName=name;
			this.salary=sal;
		}
	}
	
	void displaydetails()
	{
		if((empName!=" " || empName !=null) & salary>0 & empId >0)
		{
		System.out.println("Employee details ");
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);
		}
		else
			System.out.println("Something went wrong");
	}
}
