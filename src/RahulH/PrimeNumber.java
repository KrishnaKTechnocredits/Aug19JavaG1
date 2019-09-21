package RahulH;

public class PrimeNumber {
	static int avg;

	static void isPrime(int start, int end)
	{
		
		int sum = 0;
		int count = 0;
		
		for (int number = start; number <= end; number++) 
		{
			int cnt = 0;
			for (int i = 2; i < number / 2; i++) 
			{
				if (number % i == 0) 
				{
					cnt = 1;
					// System.out.println(number + " is not a prime number");
					break;
				}
			}
			if (cnt == 0) 
			{
				sum = sum+number;
				System.out.println(number + " is a prime number");
				count = count +1;
				avg = sum / count;
				
			}
			
		}
		System.out.println("The sum is " + sum);
		System.out.println("The total is " + count);
		System.out.println("The avg is " + avg);
	}

	public static void main(String[] args) 
	{		
			isPrime(2, 100);
	}
}
