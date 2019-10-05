/*
 7. Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 Create 3 parameterized constructor for same.  
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
and print all the details of employee having max salary.  
HINT:   Method declaration - void compareEmpSalary(Employee e1, Employee e2
 */
package VarshaT;


public class TestEmp {
	

	public static void main(String[] args) {
		Emp emp1= new Emp("varsha",123445,11);
		Emp emp2= new Emp("vineeta",123,1);
		emp1.compareSal(emp1, emp2);
	}

}
