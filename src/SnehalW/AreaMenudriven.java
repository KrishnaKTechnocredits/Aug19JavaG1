package SnehalW;

import java.util.Scanner;

/*7. Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement.
Make it a menu driven program..
Formulas:-Area Of rectangle=length*breadth Area of triangle=1/2*base*height
Area of Circle=3.14*radius*radius*/
public class AreaMenudriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for area of Rectangle");
		System.out.println("Enter 2 for area of Triangle");
		System.out.println("Enter 3 for area of Circle");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter the Length of rectangle");
			int length = sc.nextInt();
			System.out.println("Enter the Breadth of rectangle");
			int breadth = sc.nextInt();
			int Arearectangle = length * breadth;
			System.out.println("The area to Rectangle is : "+Arearectangle);
			break;
		}
		case 2: {
			System.out.println("Enter the base of rectangle");
			int base = sc.nextInt();
			System.out.println("Enter the height of rectangle");
			int height = sc.nextInt();
			int Arearectangle = base * height;
			System.out.println("The area to Rectangle is : "+Arearectangle);
			break;
		}
		case 3: {
			System.out.println("Enter the radius of circle");
			int radius = sc.nextInt();
			double Areacircle = 3.14* radius * radius;
			System.out.println("The area to Rectangle is : "+Areacircle);
			break;
		}
		default:System.out.println("Enter proper input");
		}
	}

}
