package DimpleB;

class Problem4
{
	void sumsquarearray(int arr2[])
	{
		int sum=0;
		boolean flag=true;
		if(arr2.length<=100&&arr2.length>=1)
		{
			flag=false;
			for(int i=0;i<arr2.length;i++)
			{
				sum=sum+(arr2[i]*arr2[i]);
			}
			System.out.println("Sum of sqaures of all elements of array is:"+sum);
		}
		if(flag!=false)
			System.out.println("Array size is out of range");
	}
	public static void main(String args[])
	{
		int arr2[]={11,12,13};
		//Problem4 problem4=new Problem4();
		//problem4.sumsquarearray(arr2);
		new Problem4().sumsquarearray(arr2);
	}
}