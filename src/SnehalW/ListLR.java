package SnehalW;

//5) Write a program to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100. 1≤L,R≤100.
class ListLR
{
	int left,right,i,num;
	int sum=0;
	
	int List(int left, int right)
	{
		for(int i=left;i<=right;i++)
		{
			
			System.out.println("The numbers are : "+ i);
		}
		return i;
	}
	public static void main(String a[])
	{
		ListLR listlr = new ListLR();
		listlr.List(5,10);
	}
}