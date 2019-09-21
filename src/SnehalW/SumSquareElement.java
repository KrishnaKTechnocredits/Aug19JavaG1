package SnehalW;
//4) Write a program to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 1≤N≤100

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