package ShreyaD;

import java.util.Scanner;

public class program3 {

		  void leapyear(int year)
		  {
			  boolean x = (year % 4) == 0;
		        boolean y = (year % 100) != 0;
		        boolean z = ((year % 100 == 0) && (year % 400 == 0));

		        if (x && (y || z))
		        {
		            System.out.println(year + " is a leap year");
		        }
		        else
		        {
		            System.out.println(year + " is not a leap year");
		        }
		    } 
		  

		  public static void main(String[] args)
           {
	  
			program3 p4 = new program3();  
	        Scanner sc = new Scanner(System.in); 
	        System.out.print("Input the year: ");
	        int year = sc.nextInt();
	        p4.leapyear(year);
	        sc.close();
           }
		 
	        
	}