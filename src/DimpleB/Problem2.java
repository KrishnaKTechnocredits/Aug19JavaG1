package DimpleB;

class Problem2
{
	void sumarray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elements of array is:"+sum);
	}
	public static void main(String args[])
	{
		int arr[]={10,15,20,25};
		//Problem2 problem2=new Problem2();
		//problem2.sumarray(arr);
		new Problem2().sumarray(arr);
	}
}