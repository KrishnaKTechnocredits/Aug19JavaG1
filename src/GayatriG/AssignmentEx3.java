/*3) Write a program to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 1≤N≤100 
Sample Input: 
N = 3 
Array = 6 3 8 
Sample Output: 
17*/
package GayatriG;
class AssignmentEx3
{
	int sumOfElements()
	{
		int sum=0;
		int[] num={6,3,8};
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		AssignmentEx3 assignmentex3= new AssignmentEx3();
		int addition=assignmentex3.sumOfElements();
		System.out.println("Sum of elements in Array is: "+addition);
	}
}