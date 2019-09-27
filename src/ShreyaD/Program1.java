package ShreyaD;

import java.util.Scanner;

public class Program1 {
 
	void Addoperator(int x,int y ,int z){
	      if ( x > y && x > z )
	         System.out.println("First number is largest");
	      else if ( y > x && y > z )
	         System.out.println("Second number is largest");
	      else if ( z > x && z > y )
	         System.out.println("Third number is largest");
	   }

public static void main(String args[])
   {
	Program1 p1 = new Program1();
      System.out.println("Enter three integers ");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      p1.Addoperator(x,y,z);
      sc.close();
	}
}
