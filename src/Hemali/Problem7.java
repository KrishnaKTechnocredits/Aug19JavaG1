package Hemali;

public class Problem7 {
	
	int num=12345;
	int sum=0;
	
	void sum()
	{
		while (num!=0)
		{
			int num1=num%10;
			sum=sum+num1;
			num/=10;
		}
		System.out.println("Sum of the digit is " +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem7 program7=new Problem7();
		program7.sum();
	}

}
