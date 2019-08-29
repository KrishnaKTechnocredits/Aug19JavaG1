package SnehalW;
class SumArray
{
	int num[]={1,2,3,4};
	int sum=0;
	
	void display()
	{
		for(int i=0;i<4;i++)
		{
			sum = sum+ num[i];
		}
		System.out.println("The sum of the elements of the array size 4 : "+ sum);
	}
	public static void main(String a[])
	{
		SumArray sumarray = new SumArray();
		sumarray.display();
	}
}