
package Hemali;
class Program6
{
	int array1[]={1,2,3};
	int array2[]={1,2,3};
	
	void arraySum()
	{
		
		int arrResult[]=new int[3];
		for(int i=0;i<=2;i++)
		{
			arrResult[i]=array1[i]+array2[i];
		}
		
		for(int i=0;i<=2;i++)
		{
			System.out.print(arrResult[i]);
		}
	}
	
	public static void main(String[] args)
	{
		
		Program6 program6=new Program6();
		program6.arraySum();
	}
	
}