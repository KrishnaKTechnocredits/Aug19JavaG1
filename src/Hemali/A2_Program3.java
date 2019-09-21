/*3)	Check if array contains a number in Java? 
 
Hint: Your method should accept 2 parameters. Input array and number.  
i/p :-  arr[] = {2,5,9,7,4,6} 
 	number :- 8 o/p :- number is not in arr. */
package Hemali;	
class A2_Program3
{
	
	
	void numberContains(int arr[],int num)
	{
		for(int i=0;i<arr.length;i++)
			
			{
				if(num==arr[i])
				{
					System.out.println(num  +"num is present");
					return ;
				}
				
			}
			
			System.out.println(num  +"num is not present");
	}
	

	
	
	public static void main(String[] args)
	{
		int[] arr={2,5,9,7,4,6};
		
		A2_Program3 a2_Program3=new A2_Program3();
		a2_Program3.numberContains(arr,2);
	}
	
}
