//Create Employee class and parameterized constructor with attributes empId , empName and salary
package AtulS;

public class EmployeeDetails {
	int empID;
	String empName;
	double salary;

	EmployeeDetails(int empID, String empName, double salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	void printEmployeeDetails() {
		System.out.println("EmpID:" + empID + " " + "EmpName:" + empName + " " + "Salary:" + salary);
	}

}
