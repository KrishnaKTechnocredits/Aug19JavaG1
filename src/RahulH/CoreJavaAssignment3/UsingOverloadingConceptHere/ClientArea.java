package coreJavaAssignment3.UsingOverloading;

import java.util.Scanner;

public class ClientArea extends Area{
	
	public static void main(String[] args) {
		
		Area a = new ClientArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter circle/rectange/square");
		String str = sc.nextLine();
		System.out.println("You will get area of " +str);
		
		if (str.equals("square"))
		{
			System.out.println("Please enter area " +str);
			int area = sc.nextInt();
			a.square(area);
		}
		else if (str.equals("rectangle"))
		{
			System.out.println("Please enter length and breadth " +str);
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			a.rectangle(length, breadth);
		}
		else if (str.equals("circle"))
		{
			System.out.println("Please enter radius of " +str);
			double radius = sc.nextInt();
			a.circle(radius);
		}
		sc.close();
	}
}
