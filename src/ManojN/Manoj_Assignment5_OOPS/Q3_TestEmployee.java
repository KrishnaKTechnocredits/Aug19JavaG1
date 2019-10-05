package ManojN.Manoj_Assignment5_OOPS;

public class Q3_TestEmployee extends Q3_Employee {

	Q3_TestEmployee(int empId, String empName, float salary) {
		super(empId, empName, salary);
		}

	public static void main(String[] args) {
		Q3_Employee q3 = new Q3_Employee(1234, "manoj", 500);
		q3.empDetails();
	}

}
