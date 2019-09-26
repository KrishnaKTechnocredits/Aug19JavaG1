//Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement. Make it a menu driven program
package AtulS;

import java.util.Scanner;
import java.text.*;

public class CalculateAreas {
	int len, bdt, base, hght, radius;

	private double rectangle(double len, double breadth) {
		return len * breadth;
	}

	private double triangle(double base, double height) {
		return (1 / 2) * (base * height);
	}

	private double circle(double radius) {
		return 3.14 * radius * radius;
	}

	private void selectArea(int num) { // select area based on give user input
		switch (num) {
		case 1:
			System.out.println(rectangle(len, bdt));
			break;
		case 2:
			System.out.println(triangle(base, hght));
			break;
		case 3:
			System.out.println(circle(radius));
			break;
		}
	}

	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to calculate area of Rectangle, 2 for Triangle and 3 for Circle");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("Enter length:");
			len = sc.nextInt();
			System.out.println("Enter breadth:");
			bdt = sc.nextInt();
		} else if (num == 2) {
			System.out.println("Enter base:");
			base = sc.nextInt();
			System.out.println("Enter height:");
			hght = sc.nextInt();
		} else if (num == 3) {
			System.out.println("Enter radius:");
			radius = sc.nextInt();
		} else
			System.out.println("Invalid input");
		sc.close();
		selectArea(num);
	}

	public static void main(String[] args) {
		CalculateAreas obj = new CalculateAreas();
		obj.input();
	}

}
