/*
 Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement. Make it a menu driven program..
Formulas:-Area Of rectangle=length*breadth Area of triangle=1/2*base*height
Area of Circle=3.14*radius*radius
 */
package DimpleB;
import java.util.Scanner;

public class Assignment5Problem7 {
	
	void areacalculation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shape (1-Circle,2-Rectangle,3-Triangle) :");
		int shape=sc.nextInt();
		switch(shape)
		{
				case 1 :
						System.out.println("Enter radius :");
						double r=sc.nextDouble();
						double area=3.14*r*r;
						System.out.println("Area of shape ("+shape+ "-circle) is "+area);
						break;
				case 2:
						System.out.println("Enter length :");
						double l=sc.nextDouble();
						System.out.println("Enter breadth :");
						double b=sc.nextDouble();
						area=l*b;
						System.out.println("Area of shape ("+shape+ "-rectangle) is "+area);
						break;
				case 3:
						System.out.println("Enter base :");
						double base=sc.nextDouble();
						System.out.println("Enter height :");
						double height=sc.nextDouble();
						area=(base*height)/2;
						System.out.println("Area of shape ("+shape+ "-triangle) is "+area);
						break;
				default:
						System.out.println("Please enter valid shape!");
						break;
			}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5Problem7 assignment5problem7=new Assignment5Problem7();
		assignment5problem7.areacalculation();
		
	}
}
