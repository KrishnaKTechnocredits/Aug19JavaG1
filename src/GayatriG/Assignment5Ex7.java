//Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement.
//Make it a menu driven program.. 
//Formulas:-Area Of rectangle=length*breadth, Area of triangle=1/2*base*height 
//Area of Circle=3.14*radius*radius 

package GayatriG;

import java.util.Scanner;

public class Assignment5Ex7 {
	static void area(char input){
		Scanner sc=new Scanner(System.in);
		switch(input){
			case 'r':
				
				System.out.println("Enter length of rectangle ");
				double l=sc.nextDouble();
				System.out.println("Enter breadth of rectangle ");
				double b=sc.nextDouble();
				System.out.println(l*b);
				break;
			case 't':
				System.out.println(" Enter base of triangle ");
				double base=sc.nextDouble();
				System.out.println("Enter height of triangle ");
				double h= sc.nextDouble();
				System.out.println(0.5*base*h);
				break;
			case 'c':
				System.out.println("Enter radius of circle");
				double r=sc.nextDouble();
				System.out.println(3.14*r*r);
				break;
			default:
				System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input(Area of Rectangle:r,Area of Triangle:t,Area of circle:c)");
		char area=sc.next().charAt(0);
		area(area);
	}
}
