package SnehalW;
//1) Write a program to print the sum of two integers.
class SumInt
{
	int sum=0,a,b;
	
	int sum(int a,int b)
	{	
		sum = a+b;	
		return sum;
	}
	public static void main(String a[])
	{
		SumInt sumint = new SumInt();
		int add = sumint.sum(5,6);			
		System.out.println("The Sum of two integers is : " +add);
	}
}