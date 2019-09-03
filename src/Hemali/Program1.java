package Hemali;
public class Program1
{
	
	int num1,num2;
	
	int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		Program1 program1=new Program1();
		int sum=program1.addition(10,20);
		System.out.println("Addition is:"  +sum);
		
		
		
		
	}
	
	
}