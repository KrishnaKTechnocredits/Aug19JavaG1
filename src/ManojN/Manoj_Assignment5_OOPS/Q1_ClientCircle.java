package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q1_ClientCircle  {
	public static void main(String[] args) {
		Q1_Circle circle = new Q1_Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		circle.setRadius((float)sc.nextFloat());
		sc.close();
		System.out.println("area of circle = " + circle.circleArea());
		System.out.println("circumference = " + circle.circumference());
	}
}
