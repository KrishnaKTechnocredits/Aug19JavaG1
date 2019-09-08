package AbhishekS;

public class PrimePAra {
	static void isPrime(int start, int end) // 21 /3
	{ // 4
		for (int number = start; number <= end; number++) {
			int cnt = 0;
			for (int i = 2; i <= number / 2; i++) { // 5
				if (number % i == 0) {
					cnt = 1;
					// System.out.println(number + " not prime");
					break;
				}
			}
			if (cnt == 0)
				System.out.println(number + " is prime");
		}
	}

	public static void main(String[] args) {
		
		{
			isPrime(2,300);
		}
		//isprime(21);
	//	isprime(24)
	}
}


