package AtulS;

//program to identify near minimum and maximum prime number of a given number
//e.g. For number 10 near min prime# is 7 and max prime# is 11

public class MinMaxPrime {

	static void primeminmax(int num) {
		int a = 2;
		int cnt = 0;
		int k = 0;
//		for (int j = num - 1; j >= 2; j--) {
//			cnt = 0;
//			for (int i = 2; i <= j / 2; i++) {
//				if (j % i == 0) {
//					cnt = 1;
//					break;
//				}
//			}
//
//			if (cnt == 0) {
//				System.out.println("Min Number " + j + " is prime");
//				break;
//			}
//		}

		for (k = num + 1; ; k++) {
			cnt=0;
			for (int l = 2; l < k / 2; l++) {
				if (k % l == 0) {
					cnt = 1;
				}
			}
			if (cnt == 0) {
				System.out.println("Max Number " + k + " is prime");
				break;
			}
		}
	}

	public static void main(String[] args) {
		primeminmax(50);
	}

}
