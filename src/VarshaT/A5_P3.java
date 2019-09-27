//WAP to check whether year is leap year or not
package VarshaT;

import java.util.Scanner;

public class A5_P3 {
	int a;
	void display()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year");
		a=sc.nextInt();
		sc.close();
	}
	void calc(int x)
	{
		if(x%4==0)
		{
		if(x%100==0)
		{
			if(x%400==0)
				System.out.println(x+" is a leap year");
			else
				System.out.println(x+" is not a leap year");
		}
		else
			System.out.println(x+ "is a leap year");
		}
		else
			System.out.println(x+" is not a leap year");
	}
	public static void main(String[] args) {
		A5_P3 a5_P3= new A5_P3();
		a5_P3.display();
		a5_P3.calc(a5_P3.a);
		
		
	}

}
