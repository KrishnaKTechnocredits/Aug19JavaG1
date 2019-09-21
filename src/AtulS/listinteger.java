package AtulS;

//program to list all the integers between two integers
class listinteger
{	
	int[] intlist(int x,int y)
	{
		int arrsize = (y-x)+1;
		int[] arr = new int[arrsize];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = x;
			x++;
		}
		return arr;
	}
	
	public static void main(String a[])
	{
		int[] b = new int[0];
		listinteger lst = new listinteger();
		b = lst.intlist(8,10);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Integer is : " + b[i]);
		}
	}
}