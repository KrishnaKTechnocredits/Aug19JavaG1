package SnehalW;

//6) Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1≤N≤100
class AddArray
{
	int num1[]={3,9,8};
	int num2[]={8,12,74};
	int sum=0;
	
	void display()
	{
		for(int i=0;i<3;i++)
		{
			sum = num1[i]+num2[i];
			System.out.println("The sum of the corresponding elements of the array is : "+ sum);
		}
	}
	public static void main(String a[])
	{
		AddArray addarray = new AddArray();
		addarray.display();
	}
}