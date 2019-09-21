package Hemali;

class Program3
{
	int array[]={1,2,3,4};
	
	
	
	void squareSum()
	{
		int sum=0;
		
		for(int i=0;i<=3;i++)
		{
			
			sum=sum+(array[i]*array[i]);
			
	
		}
		
		System.out.println("Sum of square of elements is : " +sum);
	}
	public static void main(String[] args)
	{
		Program3 program3=new Program3();
		program3.squareSum();
		
	}
	
}