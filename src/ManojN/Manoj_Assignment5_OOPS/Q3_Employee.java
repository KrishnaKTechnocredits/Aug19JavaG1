package ManojN.Manoj_Assignment5_OOPS;

public class Q3_Employee {
	int empId; String empName; float salary;
	Q3_Employee( int empId , String empName, float salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	void empDetails(){
		System.out.println("Emp ID = " + empId);
		System.out.println("Emp Name= " + empName);
		System.out.println("Salary ID = " + salary);
	}
}
