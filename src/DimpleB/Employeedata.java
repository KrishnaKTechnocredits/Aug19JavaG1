/*
 Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
 */

package DimpleB;

import java.util.Scanner;

public class Employeedata {
private int deptId;
	
	private static String empName;
	
	private float salary;
	
	Employeedata(int dept,float sal,String name)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	
	Employeedata(float sal,int dept,String name)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	Employeedata(String name,float sal,int dept)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dept=0;
		String name="";
		float sal=(float) 0.0;
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter employee's department ID:");
			dept=sc.nextInt();
			System.out.println("Enter employee's salary:");
			sal=sc.nextFloat();
			System.out.println("Enter employee name:");
			name=sc.next();
			
		}
		compareEmpSalary(new Employeedata(dept,sal,name),new Employeedata(name,sal,dept));
	}

	private static void compareEmpSalary(Employeedata e1, Employeedata e2) {
		// TODO Auto-generated method stub
		if(e1.salary>e2.salary)
		{
			System.out.println("Employee whose salary is maximum among two:");
			System.out.println("Employee's department ID: "+e1.deptId);
			System.out.println("Employee name: "+e1.empName);
			System.out.println("Employee's salary: "+e1.salary);
		}
		else
		{
			System.out.println("Employee whose salary is maximum among two:");
			System.out.println("Employee's department ID: "+e2.deptId);
			System.out.println("Employee name: "+e2.empName);
			System.out.println("Employee's salary: "+e2.salary);
		}
	}

}
