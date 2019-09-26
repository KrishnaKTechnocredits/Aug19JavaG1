//Create Employee class and parameterized constructor with attributes empId , empName and salary. 
//Write a method to display the details of employees. 
//Create a TestEmployee class to test Employee class functionality. 

package GayatriG;

public class Assignment5Part2Ex3Employee {
	int empId;
	String name;
	double salary;
	
	public Assignment5Part2Ex3Employee(int eId,String name, double sal) {
		
		empId=eId;
		this.name=name;
		salary=sal;
		//displayDetails();
	}
	
	void displayDetails(){
		System.out.println("Employee id is: "+empId+ "\nName of Employee is: "+name+"\nSalary of employee is: "+salary);
	}
}
