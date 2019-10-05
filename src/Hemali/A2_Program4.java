/*4)	Largest and smallest number in unsorted array? */


package Hemali;
class A2_Program4
{
	int array[]={5, 2, 3, 13,1};
	
	void largeSmall()
	{
		int smallest=array[0];
		int largest=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
				
			}
			if(array[i]>largest)
				
				{
					
					largest=array[i];
				}
		
		}
		System.out.println("Smallest and largest no is" +smallest +"and  " +largest);
	}
	
	
	
	public static void main(String[] args)
	{

		
		A2_Program4 a2_Program4=new A2_Program4();
		a2_Program4.largeSmall();
	}
	
}