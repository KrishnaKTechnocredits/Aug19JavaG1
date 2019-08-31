class Assignment1_2
{
	int a[] = {14,15,100,89};
	int sum =0;
	int add()
	{
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static void main (String args[])
	{
		Assignment1_2 ass1_2 = new Assignment1_2();
		int total = new Assignment1_2().add();
		System.out.println("The total is: " +total);
	}
}