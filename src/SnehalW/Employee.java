package SnehalW;

/*3. Create Employee class and parameterized constructor with attributes empId , empName and salary. 
 * Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality.*/
public class Employee {
	int EmpId = 101;
	int Salary = 15000;
	String Empname = "Snehal";

	Employee() {
	}

	Employee(int empid, String empname, int salary) {
		EmpId = empid;
		Empname = empname;
		Salary = salary;
	}

	void display() {
		System.out.println(
				"EmployeeId: " + EmpId + "\n" + "EmployeeName: " + Empname + "\n" + Empname + "Salary: " + Salary);
	}
}
