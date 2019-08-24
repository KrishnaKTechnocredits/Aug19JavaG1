/*4) Write a program to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 1≤N≤100 
Sample Input 
N = 5 
Array = 4 7 2 8 5 
Sample Output: 
158*/
package GayatriG;
class AssignmentEx4
{
	int square()
	{
		int sum=0;
		int[] num={4,7,2,8,5};
		for(int i=0;i<num.length;i++)
		{
			sum=sum+(num[i]*num[i]);
		}
		return sum;
	}
	public static void main(String args[])
	{
		//AssignmentEx4 assignmentex4= new AssignmentEx4();
		int sumOfSquares=new AssignmentEx4().square();
		System.out.println("Sum of squares of elements in the array is: "+sumOfSquares);
	}
}