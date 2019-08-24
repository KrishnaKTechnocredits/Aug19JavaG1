package DimpleB;

public class PrimeNumber {
	static void primecheck(int start, int end) {
		int flag1 = 1, sum = 0, count = 0;
		for (int number = start; number <= end; number++) {
			int ct = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					ct = 1;
					/* System.out.println(number+" is not prime."); */
					break;
				}
			}
			if (ct == 0) {
				count++;
				sum = sum + number;
				System.out.println(number + " is prime.");

			}

		}
		System.out.println("Sum is:" + sum);

	}

	public static void main(String args[]) {
		primecheck(200, 300);

	}
}
