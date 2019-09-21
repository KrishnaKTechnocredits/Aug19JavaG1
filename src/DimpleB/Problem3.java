package DimpleB;

class Problem3
{
	void sumarr(int arr1[])
	{
		int sum=0;
		boolean flag=true;
		if(arr1.length<=100&&arr1.length>=1)
		{
			flag=false;
			for(int i=0;i<arr1.length;i++)
			{
				sum=sum+arr1[i];
			}
			System.out.println("Sum of all elements of array is:"+sum);
		}
		if(flag!=false)
			System.out.println("Array size is out of range");
	}
	public static void main(String args[])
	{
		int arr1[]={11,12,13,14,15,16};
		//Problem3 problem3=new Problem3();
		//problem2.sumarray(arr);
		new Problem3().sumarr(arr1);
	}
}