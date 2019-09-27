package RahulH.CoreJavaAssignment3.ClassesAndObjects;

public class Employee {
	
	protected Employee(int empID, String empName, int salary)
	{
		employee(empID, empName, salary);
	}

	protected void employee(int empID, String empName, int salary)
	{
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
	}
}
