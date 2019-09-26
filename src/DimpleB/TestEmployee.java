/*
 Create Employee class and parameterized constructor with attributes empId , empName and salary. Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality.
 */
package DimpleB;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(398231,"Lata",25000);
		e.displaydetails();;
		Employee e1=new Employee(-1,"Sita",15000);
		e1.displaydetails();;
	}
}
