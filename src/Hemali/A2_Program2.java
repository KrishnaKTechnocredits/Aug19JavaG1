/*2)	Find duplicate number on Integer array in Java? 
 
Hint: There is exactly one number is repeated in the array. You need to write a program to find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. */
package Hemali;

class A2_Program2
{
	
	int[] a={0,3,1,2,3};
	
	void duplicate()
	{
		for(int i=0;i<a.length-1;i++)
			
			{
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println("Duplicate number: " +a[i]);
						
					}
				}
				
			}
		
	}
	
	public static void main(String[] args)
	{
		
		
		A2_Program2 a2_Program2=new A2_Program2();
		a2_Program2.duplicate();
	}
	
}