package SnehalW;
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