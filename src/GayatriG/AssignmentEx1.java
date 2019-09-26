//1) Write a program to print the sum of two integers.
package GayatriG;
class AssignmentEx1
{
	int display(int int1, int int2)
	{
		//System.out.println("Sum of two numbers is:" + (int1+int2));
		return int1+int2;
	}
	public static void main(String args[])
	{
		//AssignmentEx1 assignmentex1= new AssignmentEx1();
		int sum= new AssignmentEx1().display(23,66);
		System.out.println("Sum of two numbers is:"+sum);
	}
}