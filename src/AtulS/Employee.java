//Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner
package AtulS;

public class Employee {

	String name, deptID;
	double salary;

	Employee(String name, String deptID, double salary) {
		this.name = name;
		this.deptID = deptID;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ":" + deptID + ":" + salary;
	}

	void printMaxSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary)
			System.out.println(e1.toString());
		else
			System.out.println(e2.toString());
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("ABC", "1223", 15000.00);
		Employee e2 = new Employee("ABC", "1223", 16000.00);
		e1.printMaxSalary(e1, e2);
	}

}
