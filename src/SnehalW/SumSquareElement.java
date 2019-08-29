package SnehalW;
class SumSquareElement
{
	int num[]={4,7,2,8,5};
	int sum=0;
	
	void display()
	{
		for(int i=0;i<5;i++)
		{	int Square = num[i]*num[i];
			sum = sum + Square;
		}
		System.out.println("The sum of the square of the elements is : "+ sum);
	}
	public static void main(String a[])
	{
		SumSquareElement sumsuareelement = new SumSquareElement();
		sumsuareelement.display();
	}
}