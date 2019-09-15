package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q7_sumOfDigit {
	static int mod, input, sum = 0;
	static int acceptInt() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		input = sc.nextInt();
		sc.close();
		while (input > 0) {
			mod = input % 10;
			sum = sum + mod;
			input = input/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of digits : "+ acceptInt());
	}
}
/*
Q7) WAP to print sum of digit(Consider Input as Integer not as String)
Example:-
input:- 12345
output:- 15
*/