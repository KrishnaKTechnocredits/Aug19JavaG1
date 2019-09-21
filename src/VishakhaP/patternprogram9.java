package VishakhaP;

import java.util.Scanner;

public class patternprogram9 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows you want to print :");
					
		int rows = sc.nextInt();
		System.out.println("Printing the pattern");
		for(int i= 1;i<=rows;i++)
		{
		   for(int j =i;j<rows;j++)
		   {
			   System.out.print(" ");
		   }
		    for(int k =1;k<=(2*i-1);k++)

				  if((k == 1 || i == rows || k == (2*i-1)))
						  {
					        System.out.print("*");
						  }
	          else{
	        	      System.out.print(" ");
                 }
		   System.out.println();
		 }
		   
			 sc.close();
		}
	}



	        		  

	
				
	          