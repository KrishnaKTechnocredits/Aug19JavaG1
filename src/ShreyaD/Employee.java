package ShreyaD;

public class Employee {
	int empid; 
	String emp_name; 
    int salary;
	Employee(int empid,  String emp_name , int salary){
		
		this.empid=empid;
		this.emp_name=emp_name;
		this.salary=salary;
	}

void Display()
{
	System.out.println("employee name:"+empid);
	System.out.println("employee name:"+emp_name);
	System.out.println("employee name:"+salary);
}
    public static class Test
{
    	public static void main(String[] args) {
    		Employee E1 = new Employee(1,"shreya",50000);
    		E1.Display();
		}
	
}
}
