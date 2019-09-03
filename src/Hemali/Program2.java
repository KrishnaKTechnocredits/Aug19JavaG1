
package Hemali;
public class Program2
{
	
	int a[]={1,2,3,4};
	
	void sum()
	{
		int add=0;
		for (int i=0;i<a.length;i++)
		{
		add=add+a[i];	
			
		}
		System.out.println("Sum of array of element is :"  +add);
	}
	
public static void main(String[] args)
{
	Program2 program2=new Program2();
	program2.sum();



}	
	
}