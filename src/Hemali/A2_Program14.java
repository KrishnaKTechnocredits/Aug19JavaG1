package Hemali;

class A2_Program14
{
	int array[]={15,24,52,49,62,10};
	
	
	void evenNumber()
	{
		for(int i=0;i<array.length;i++)
			
		{
			if(array[i]%2==0)
				System.out.print(array[i]+" ");
				
				
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		A2_Program14 a2_Program14=new A2_Program14();
		a2_Program14.evenNumber();
	}
	
	
}