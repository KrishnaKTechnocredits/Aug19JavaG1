package Hemali;

class A2_Program13
{
	
	int[] arr={5,6,9,10,14,63};
	
	
	void reverse()
	{
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.print(arr[i] + " ");	
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		A2_Program13 a2_Program13=new A2_Program13();
		a2_Program13.reverse();
	}
	
	
	
}