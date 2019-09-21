package DimpleB;

class Problem6
{
	void sumtwoarray(int a[],int b[])
	{
		boolean flag=true;
		if(a.length>=1&&a.length<=100&&b.length>=1&&b.length<=100)
		{
			flag=false;
			for(int i=0;i<a.length;i++)
			{ 
				System.out.println("Sum of elements at index "+i+" is: "+(a[i]+b[i]));
			}
		}
		if(flag!=false)
			System.out.println("Array size is out of boundary");
	}
	public static void main(String args[])
	{
		int arr1[]={1,2,3};
		int arr2[]={4,5,6};
		//Problem6 problem6=new Problem6();
		//problem6.sumtwoarray(arr1,arr2);
		new Problem6().sumtwoarray(arr1,arr2);
	}
}