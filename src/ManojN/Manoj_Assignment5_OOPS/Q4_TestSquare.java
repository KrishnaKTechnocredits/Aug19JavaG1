package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q4_TestSquare  {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter side of square = ");
		Q4_Square q4 = new Q4_Square(sc.nextInt());
		System.out.println("Area of square is = ");
		System.out.println(q4.area());
		sc.close();
	}
}
