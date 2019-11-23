//Do individual sum of odd & even and check difference between that is prime number or not
//eg:- "12159346279"
//Hint :- oddSum-evenSum = is prime
package VarshaT;

public class Program1_Class_Test {
	void sum(String s)
	{
		int num, rem, oSum = 0, eSum = 0, res, count = 0;
		int s1 = Integer.parseInt(s);
		num = s1;

		while (s1 != 0) {
			rem = s1 % 10;
			if (rem % 2 == 0) {
				eSum += rem;
			} else {
				oSum = oSum + rem;
			}
			s1 /= 10;
		}
		if (oSum > eSum)
			res = oSum - eSum;
		else
			res = eSum - oSum;
		for (int i = 2; i <= res / 2; i++) {
			if (res % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("difference between" + eSum + " and " + oSum + " = " + res + " is prime number");

		} else {
			
				System.out.println("difference between" + eSum + " and " + oSum + " = " + res + " is not a prime number");

			}
		}
		

	public static void main(String[] args) {
		Program1_Class_Test obj = new Program1_Class_Test();
		String s = "1215934626";
		obj.sum(s);
		
	}
}

