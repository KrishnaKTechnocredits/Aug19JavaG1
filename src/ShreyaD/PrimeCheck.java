package ShreyaD;

public class PrimeCheck {
	static void isPrime(int number)// 21
	{

		int cnt = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				cnt = 1;
				System.out.println(number + "not prime");
				break;
			}
		}
		if (cnt == 0)
			System.out.println(number + "is prime");

	}

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			isPrime(i);
		}

	}

}
