package RahulH;

public class Q1 {
	
	int num[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
	int sum1 = 0;
	int sum2 = 55;
	int missing;
	int start = 1;
	int end = 10;
	int sum = 0;
	
	void arraySum()
	{
		for (int i=0; i<end; i++)
		{
			sum = 0+sum;
		}
	}
	
	void missing()
	{
		for (int i=0; i<num.length; i++)
		{
			sum1 = sum1 + num[i];
		}
		System.out.println("The sum is: " +sum1);
		missing = sum2-sum1;
		System.out.println("The missing number is: " +missing);
	}
	
	public static void main(String[] args) {
		
		new Q1().missing();
	}
}
