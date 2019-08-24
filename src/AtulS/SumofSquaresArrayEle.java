//print the sum of squares of the elements of an array of size N
class SumofSquaresArrayEle
{
	int arraysum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			sum = sum + (arr[i] * arr[i]);
		}		
		return sum;
	}
	
	public static void main(String a[])
	{
		int[] b = {4,7,2,5,8};
		SumofSquaresArrayEle sumarray = new SumofSquaresArrayEle();
		System.out.println(sumarray.arraysum(b));
		
	}
}