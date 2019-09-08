package VarshaT;

public class PrimeCheck {

	static void isPrime(int start, int end) {
		int sum = 0,counter=0;
		for (int number = start; number <= end; number++) {
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count = 1;
					//System.out.println(number + " is not a prime number");
					break;
				}
			}
			if (count == 0) {
				sum+=number;
				counter++;
				System.out.println(number + " is  prime number");
				
			}
			
		}
		System.out.println("sum is:"+sum);
		System.out.println("count of prime numbers"+counter);
	}

	public static void main(String[] args) {
		isPrime(3, 10);
	}
}
