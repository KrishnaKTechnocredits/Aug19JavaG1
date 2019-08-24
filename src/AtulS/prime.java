
package AtulS;

public class prime {

	static void primenum(int x, int y) {
		int sum = 0;int avg = 0;
		int counter = 0;
		for (int number = x; number <= y; number++) {
			int cnt = 0;
			for (int i = 2; i <= number/2; i++) {
				if (number % i == 0) {
					cnt = 1;
					break;
				}
			}
			if (cnt == 0){
				System.out.println("Given number " + number + " is prime");
				counter = counter + 1;
				sum = sum + number;
				avg = sum / counter;
			}
		} 
		System.out.println("Total Sum of " + counter + " Prime number between " + x + " and " + y + " is: " + sum + " with average " + avg);
	}

	public static void main(String[] args) {
		primenum(2, 10);
		primenum(2, 10);
		
	}

}
