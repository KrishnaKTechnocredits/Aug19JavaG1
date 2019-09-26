package DimpleB;

class Problem7
{
	void absdiff(int a,int b)
	{
		int diff=a-b;
		if(diff>0)
		{
			System.out.println("Absolute difference between two numbers "+a+" and "+b+" is : "+diff);
		}
		else
		{
			diff=diff*(-1);
			System.out.println("Absolute difference between two numbers "+a+" and "+b+" is : "+diff);
		}
	}
	public static void main(String args[])
	{ 
		//Problem6 problem6=new Problem6();
		//problem6.sumtwoarray(arr1,arr2);
		new Problem7().absdiff(9,12);
	}
}