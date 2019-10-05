/*
 Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
 */
package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q7_EmployeeData {
	private static String empName;
	private float salary;
	private int deptId;
	
	Q7_EmployeeData(int dept,float sal,String name)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	
	Q7_EmployeeData(float sal,int dept,String name)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	Q7_EmployeeData(String name,float sal,int dept)
	{
		this.deptId=dept;
		this.empName=name;
		this.salary=sal;
	}
	
	public static void main(String[] args) {
		
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
		compareEmpSalary(new Q7_EmployeeData(dept,sal,name),new Q7_EmployeeData(name,sal,dept));
	}

	private static void compareEmpSalary(Q7_EmployeeData e1, Q7_EmployeeData e2) {
		
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
