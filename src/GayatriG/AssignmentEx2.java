//2) Write a program to print the sum of all the elements of an array of size 4.
package GayatriG;
class AssignmentEx2
{
	int sum()
	{
		int add=0;
		int[] num={5,4,8,3,9,5};
		for(int i=0;i<num.length;i++)
		{
			add=add+num[i];
		}
		//System.out.println("Sum is: "+add);
		return add;
	}
	public static void main(String args[])
	{
		AssignmentEx2 assignmentex2=new AssignmentEx2();
		int addition=assignmentex2.sum();
		System.out.println("Sum is: "+addition);
	}
}