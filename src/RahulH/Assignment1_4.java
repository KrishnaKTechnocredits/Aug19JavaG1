package RahulH;
class Assignment1_4
{
	int a[] = {4,7,2,8,5};
	int sum =0;
	
	void square()
	{
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Square of " +a[i]+ " is: " +(a[i]*a[i]));
			sum = sum + (a[i]*a[i]);
		}
		System.out.println("Total sum is: " +sum);
	}
	
	public static void main (String args[])
	{
		new Assignment1_4().square();
	}
}