package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q6_factorial {
	static int inputNum(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any #");
		int num1 = sc.nextInt();
		sc.close();
		return num1;
	}
	static void factorial(int x){
		int fact = 1;
		for (int i=5; i>=1;i--){
			fact = fact * x;
			x--;
		}
		System.out.println("Factorial is " +fact);
	}
	public static void main(String[] args) {
		factorial(inputNum());
	}
}
