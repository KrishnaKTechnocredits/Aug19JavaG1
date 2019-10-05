package VishakhaP;

import java.util.Scanner;

public class LeapYear {

		public static void main (String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Year");
			int year = sc.nextInt();
			if(year%4==0 && year %400==0 || year %10==0)
			{
				System.out.println("leap year");
				
			}else
			{
			    System.out.println("Not leap year");
		}

	}
	}