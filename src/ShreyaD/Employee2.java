package ShreyaD;

public class Employee2 {

	String name,deptID;
	double salary;
	Employee2(String name,String deptID,double salary)
	{
		this.name=name;
		this.deptID= deptID;
		this.salary=salary;
	}
	public String toString()
	{
		return name+":"+salary;
	}
	void printmaxsalary(Employee2 e1,Employee2 e2)
	{
		if(e1.salary>e2.salary)
		System.out.println(e1);
	else
		System.out.println(e2);
}
 public static void main(String []srga)
 {
	 Employee2 e1 = new Employee2("shreya","1234",20000);
	 Employee2 e2 = new Employee2("varsha","5678",10000);
	 e1.printmaxsalary(e1, e2);
 }
 }
