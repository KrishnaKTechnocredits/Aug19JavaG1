//program to identify near minimum and maximum prime number of a given number
//e.g. For number 10 near min prime# is 7 and max prime# is 11
package loopExamples;

public class MinMaxPrime {

	static void primeminmax(int num) {
		int a = 2;
		int cnt = 0;
		int k = 0;
		for (int j = num - 1; j >= 2; j--) {
			cnt = 0;
			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					cnt = 1;
					break;
				}
			}

			if (cnt == 0) {
				System.out.println("Min Number " + j + " is prime");
				break;
			}
		}
		
		for (k = num + 1; k < 999; k++) {
			cnt = 0;
			if (k % a == 0) {
				cnt = 1;
			}
			a++;
			if (cnt == 0) {
				System.out.println("Max Number " + k + " is prime");
				break;
			}
		}

	}

	public static void main(String[] args) {
		primeminmax(25);
	}

}
