/*6) Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100 
     
     Sample Input:   N= 3 
numArrayA  = 3 9 8 
numArrayB = 8 12 74 
      Sample Output: 
      11 21 82 */
package GayatriG;
class AssignmentEx6
{
	void sumOfElements()
	{
		int[] num1={3,9,8};
		int[] num2={8,12,74};
		for(int i=0;i<num1.length;i++)
		{
			int sum=num1[i]+num2[i];
			System.out.print(sum+" ");
		}
	}
	public static void main(String args[])
	{
		AssignmentEx6 assignmentex6=new AssignmentEx6();
		assignmentex6.sumOfElements();
	}
}