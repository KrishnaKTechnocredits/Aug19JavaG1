//program to print the sum of all the elements of an array of size N
class SumofArrayElements
{
	int arraysum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}		
		return sum;
	}
	
	public static void main(String a[])
	{
		int[] b = {10,10,10,10};
		SumofArrayElements sumarray = new SumofArrayElements();
		System.out.println(sumarray.arraysum(b));
		
	}
}