package VarshaT;

import java.util.Scanner;

public class A5_P7 {
	int x;
	Scanner sc= new Scanner(System.in);
	int menu()
	{
		System.out.println("Press 1 to calculate area of Rectangle");
		System.out.println("Press 2 to calculate area of Triangle");
		System.out.println("Press 3 to calculate area of Circle");
		System.out.println("Enter your choice:");
		x=sc.nextInt();
		return x;
	}
	
	double area(int x)
	{
		double f=0.0;
		
		switch (x)
		{
		case 1:
			System.out.println("enter the length:");
			int x1=sc.nextInt();
			System.out.println("enter the breadth:");
			int y1= sc.nextInt();
			f= x1*y1;
			break;
			
		case 2:
			System.out.println("enter the base:");
			int b= sc.nextInt();
			System.out.println("enter the height:");
			int h= sc.nextInt();
			f=(b*h)/2;
			break;
		case 3:
			System.out.println("enter the radius:");
			int r=sc.nextInt();
			f=3.14*r*r;
			break;		
		}
		return f;
	}
	public static void main(String[] args) {
		A5_P7 a5_P7= new A5_P7();
		Double d=a5_P7.area(a5_P7.menu());
		System.out.println("Area="+d);
	}

}
