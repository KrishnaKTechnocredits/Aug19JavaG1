/*1)	Find the missing number in integer array of 1 to 10? 
 
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array. */

package Hemali;

class A2_Program1
{
	
	int arr[]={1,2,3,4,5,7,8,9,10};
	
	void missingNumber()
	{
		int temp=1;
		for (int i=0;i<arr.length;i++)
		{
		if(arr[i]==i+temp)
		{
			System.out.println(arr[i]);
		}
		else
		{
		System.out.println("Missing number is:" +(i+temp));
		temp++;
		System.out.println(i+temp);
		}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		
		A2_Program1 program1=new A2_Program1();
		program1.missingNumber();
	}
	
	
	
}