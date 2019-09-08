package DimpleB;

class Problem5
{
	void listarray(int a,int b)
	{
		/*int sum=0;*/
		boolean flag=true;
		if(a>=1&&a<=100&&b>=1&&b<=100)
		{
			flag=false;
			for(int i=a;i<=b;i++)
			{
				System.out.print(i+"\t");
			}
		}
		if(flag!=false)
			System.out.println("Integer range is out of boundary");
	}
	public static void main(String args[])
	{
		//Problem5 problem5=new Problem5();
		//problem45.listarray(0,0);
		new Problem5().listarray(1,0);
	}
}