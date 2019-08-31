class Assignment1_7
{
	void Subtraction(int a, int b)
	{
		int c = a-b;
		if (c>=0)
		{
			System.out.println("The ans is:" +c);
		}
		else
		{
			System.out.println("The ans is:" +c*(-1));
		}
	}
	
	public static void main (String a[])
	{
		new Assignment1_7().Subtraction(5,100);
	}
	
	
}