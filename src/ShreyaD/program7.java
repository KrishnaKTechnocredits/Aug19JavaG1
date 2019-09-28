package ShreyaD;

import java.util.Scanner;

public class program7 {
	 
		 public static void main(String[]args){
         Scanner s =new Scanner(System.in);
        
         System.out.println("1.Area of  Circle");
         System.out.println("2.Area of Triangle");
         System.out.println("3.Area of  Rectangle");
         System.out.println("Enter your option:");
         int op=s.nextInt();
          s.close();
         switch(op)
         {
               case 1: System.out.println("Enter radius:");
                           float r=s.nextFloat();
                           float ac=3.14f*r*r;
                          System.out.println("Area:"+ac);
                          break;

              case 2: System.out.println("Enter base and hight:");
                           int b=s.nextInt();
                           int h=s.nextInt();
                           int as=1/2*b*h;
                          System.out.println("Area:"+as);
                          break;

             case 3: System.out.println("Enter length and breadth:");
                           int l=s.nextInt();
                           int br=s.nextInt();
                           int ar=l*br;
                          System.out.println("Area:"+ar);
                          break;
              default:
            	  System.out.printf("Entered wrong input");
	                
             }
          }
}