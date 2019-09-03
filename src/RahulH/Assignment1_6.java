package RahulH;
class Assignment1_6
{
	int numArrayA[] = {3,9,8};
	int numArrayB[] = {8,12,74};
	
	void m1()
	{
		if (numArrayA.length == numArrayB.length)
			for (int i=0; i<numArrayA.length; i++)
			{
				System.out.println(numArrayA[i]+numArrayB[i]);
			}
		else
		{
			System.out.println("Length of arrays do not match");
		}
	}
	
	public static void main (String args[])
	{
		new Assignment1_6().m1();
	}
}