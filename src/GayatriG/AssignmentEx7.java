/*7) You are given two numbers N and M, print the absolute difference between two numbers i.e. |N−M| 
Approach: 
Store the difference of N and M in a temporary variable result. Check if the value of result is negative. 
The question is to print the absolute difference. Therefore, if the value is negative, then make it positive by multiplying it with −1. 
Print out the value of result.*/
package GayatriG;
class AssignmentEx7
{
	int difference(int a, int b)
	{
		int adiff=a-b;
		if(adiff<0)
		{
			adiff=adiff*(-1);
		}
		return adiff;
	}
	public static void main(String args[])
	{
		AssignmentEx7 assignmentex7=new AssignmentEx7();
		int diff=assignmentex7.difference(2,6);
		System.out.println(diff);
	}
}
