package RahulH;
class Assignment1_1
{
	int sum(int a, int b)
	{
		int sum= a+b;
		return sum;
	}
	
	public static void main (String args[])
	{	
		//Assignment1_1 ass1_1 = new Assignment1_1();
		//int total = ass1_1.sum(100, 150);
		int total = new Assignment1_1().sum(100, 150);
		System.out.println("The sum is: " +total);
	}
}