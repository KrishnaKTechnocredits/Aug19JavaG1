/*
 7. Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 Create 3 parameterized constructor for same.  
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
and print all the details of employee having max salary.  
HINT:   Method declaration - void compareEmpSalary(Employee e1, Employee e2
 */


//REFER EmpTest for class calling

package VarshaT;

public class Emp {
	private String name;
	private float salary;
	private int deptId;
	Emp(String name, float salary, int deptId)
	{
		this.name=name;
		this.salary=salary;
		this.deptId=deptId;
	}
	void compareSal(Emp emp1, Emp emp2)
	{
		if(emp1.salary>emp2.salary)
		{
			System.out.println("-------DETAILS------");
			System.out.println("NAME: "+name);
			System.out.println("SALARY: "+salary);
			System.out.println("DEPARTMENT ID: "+deptId);
		}
		else
		{
			System.out.println("-------DETAILS------");
			System.out.println("NAME: "+name);
			System.out.println("SALARY: "+salary);
			System.out.println("DEPARTMENT ID: "+deptId);
		}
	}

}
