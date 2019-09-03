
package RahulH;
class Assignment1_3
{
	int add()
	{
		int a[] = {4,5,9};
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static void main (String a[])
	{
		//Assignment1_3 ass1_3 = new Assignment1_3();
		int total = new Assignment1_3().add();
		System.out.println("The total is: "+total);
		
	}
}