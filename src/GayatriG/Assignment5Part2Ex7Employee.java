/*Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 * Create 3 parameterized constructor for same.  
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
and print all the details of employee having max salary.  
HINT:   Method declaration - void compareEmpSalary(Employee e1, Employee e2); */

package GayatriG;

import java.util.Scanner;

public class Assignment5Part2Ex7Employee {
	String empName;;
	int deptId;
	double salary;
	
	public Assignment5Part2Ex7Employee(String name,int deptId,double salary) {
		this.empName=name;
		this.deptId=deptId;
		this.salary=salary;
	}
	
	static void compareSalary(Assignment5Part2Ex7Employee emp1,Assignment5Part2Ex7Employee emp2){
		if(emp1.salary>emp2.salary){
			System.out.println("Details of Employee with highest salary is: "+emp1.empName+" : "+emp1.deptId+" : "+emp1.salary);
		}
		else
			System.out.println("Details of Employee with highest salary is: "+emp2.empName+" : "+emp2.deptId+" : "+emp2.salary);

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name");
		String name1=sc.next();
		System.out.println("Enter employee department id");
		int deptId1=sc.nextInt();
		System.out.println("Enter salary of the employee");
		double sal1=sc.nextDouble();
		Assignment5Part2Ex7Employee emp1=new Assignment5Part2Ex7Employee(name1,deptId1,sal1);
		
		System.out.println("Enter Employee name");
		String name2=sc.next();
		System.out.println("Enter employee department id");
		int deptId2=sc.nextInt();
		System.out.println("Enter salary of the employee");
		double sal2=sc.nextDouble();
		Assignment5Part2Ex7Employee emp2=new Assignment5Part2Ex7Employee(name2,deptId2,sal2);
		compareSalary(emp1,emp2);
		
	}
}
