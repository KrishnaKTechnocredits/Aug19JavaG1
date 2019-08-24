// Prime number program

package ManojN;

public class PrimeCheck {
	static void isPrime(int start, int end) {
		int sum=0; int primeNoCount=0;
		for (int number = start; number <= end; number++) {
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count = 1;
					// System.out.println(number + "= not prime");
					break; // 'break' can be used with loops (for,while etc.) only
							// and not with if or any other condition
				}
			}
				if (count == 0){
					System.out.println(number + "= prime");
					sum = sum+number;
					primeNoCount++;
				}
		}
		System.out.println("Sum of Prime number = " + sum);
		System.out.println("Count of Prime Number  = " + primeNoCount);
	}
	public static void main(String[] args) {
		//for (int number = start; number <= end; number++)  {
			isPrime(2,100);
			System.out.println();
			//isPrime(200,300);
		}
	}

