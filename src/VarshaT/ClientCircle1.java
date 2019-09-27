package VarshaT;

import java.util.Scanner;

public class ClientCircle1 {
	private float radius;
	private int choice;
	Scanner sc= new Scanner(System.in);
	void getRadius()
	{
		System.out.println("enter the radius:");
		radius= sc.nextFloat();
	}
	ClientCircle1()
	{
		System.out.println("Press 1 to calculate AREA.");
		System.out.println("Press 2 to calculate CIRCUMFERENCE.");
		System.out.println("enter your choice");
		choice= sc.nextInt();
		
	}
	void call(Circle1 circle1)
	{
		
		switch(choice)
		{
		case 1:
			circle1.area();
			break;
		case 2:
			circle1.circumf();
			break;
		default:
			System.out.println("Enter correct choice!!");
			break;
		}
	}
	
	public static void main(String[] args) {
		ClientCircle1 clientCircle= new ClientCircle1();
		clientCircle.getRadius();
		Circle1 circle1= new Circle1(clientCircle.radius);
		clientCircle.call(circle1);
	}

}
