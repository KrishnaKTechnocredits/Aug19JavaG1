/*5) Write a program to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100. 1≤L,R≤100. 
    Sample Input: 
    L = 5, R = 10 
    Sample Output: 
    5 6 7 8 9 10  */

package GayatriG;
class AssignmentEx5
{
	//static void display()
	static void display(int l, int r)
	{
			//int l=5;
			//int r=10;
			for(int i=l;i<=r;i++)
			{
				System.out.print(i+" ");
			}
	}
	public static void main(String args[])
	{
		//display();
		display(5,10);
	}
}