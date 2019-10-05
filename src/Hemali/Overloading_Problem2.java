package Hemali;

import java.util.Scanner;

public class Overloading_Problem2 {
	
	double rectWidth,rectHeight;
	double circleRadius;
	final double pi=3.14;
	

		
		
		double area(double rectWidth,double rectHeight)
		{
			double areaOfRectangle=rectWidth*rectHeight;
			return areaOfRectangle;
		}
		double area(double circleRadius)
		{
			double areaOfCircle=pi*(circleRadius*circleRadius);
			return areaOfCircle;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_Problem2 problem2=new Overloading_Problem2();
		Scanner sc=new Scanner(System.in);
		int option=1;
		while(option!=0){
		System.out.println("Select type:\n 1.Circle\n 2.Rectangle \n 3.Square \n Select the option: \n" );
		 option=sc.nextInt();
		double area;
		switch(option)
		{
		case 1:
			System.out.println("Enter the radius : ");
			double radius=sc.nextDouble();
			 area=problem2.area(radius);
			System.out.println("Area of circle is "+area);
			break;
		case 2:
			System.out.println("Enter the height : ");
			double height=sc.nextDouble();
			System.out.println("Enter the width : ");
			double width=sc.nextDouble();
			 area=problem2.area(height,width);
			System.out.println("Area of rectangle is "+area);
			break;
		case 3:
			System.out.println("Enter the side : ");
			double side=sc.nextDouble();
			area=problem2.area(side, side);
			System.out.println("Area of square is "+area);
			break;
		case 0:
			System.out.println("Program Terminated");
			System.exit(0);
		}
		}
		
	}

	

}
