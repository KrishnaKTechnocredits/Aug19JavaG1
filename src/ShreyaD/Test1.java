package ShreyaD;

public class Test1 {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		String s = "1215934626";
		int num, remander, oddSum = 0, EvenSum = 0, res, cnt = 0;
		int s1 = Integer.parseInt(s);
		num = s1;

		while (s1 != 0) {
			remander = s1 % 10;
			if (remander % 2 == 0) {
				EvenSum += remander;
			} else {
				oddSum = oddSum + remander;
			}
			s1 /= 10;
		}
		if (oddSum > EvenSum)
			res = oddSum - EvenSum;
		else
			res = EvenSum - oddSum;
		for (int i = 2; i <= res / 2; i++) {
			if (res % i == 0) {
				cnt++;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("difference between" + EvenSum + " and " + oddSum + " = " + res + " is prime number");

		} else {

			System.out.println(
					"difference between" + EvenSum + " and " + oddSum + " = " + res + " is not a prime number");

		}
	}

}
