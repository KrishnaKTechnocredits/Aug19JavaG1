package SnehalW;
import java.util.Scanner;

//2. Find greater of two numbers using ternary operator.
public class Greaterof2number {

	public static void main(String[] args) {
		{
			int a, b, greater;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number :");
			a = sc.nextInt();
			System.out.println("Enter 2nd number :");
			b = sc.nextInt();
			sc.close();
			greater =((a > b) ? a : b); 
			System.out.println("Greater Number is :" + greater);
		}
	}
}
