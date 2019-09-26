/*6)Write a java program to check the equality of two arrays? 
 
Hint: Input Arrays : 
First Array : [21, 57, 11, 37, 24] 
Second Array : [21, 57, 11, 37, 24] 
Two Arrays Are Equal */
package Hemali;

class A2_Program6
{
	
	int array1[]={21, 56, 11, 37, 24};
	int array2[]={21, 57, 11, 37, 24};
	void equalArray()
	{
		if(array1.length!=array2.length)
		{
		return;
		}
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])
				{
	               System.out.println("Arrays are not equal");
					return;
				}

					
			
		}
		System.out.println("Arrays are equal");
		
	}
	
	public static void main(String[] args)
	{

		
		A2_Program6 a2_Program6=new A2_Program6();
		a2_Program6.equalArray();
	
}
}