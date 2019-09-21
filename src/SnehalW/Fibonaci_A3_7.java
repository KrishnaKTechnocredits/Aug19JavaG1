package SnehalW;

import java.util.Scanner;
/*
7)	WAP to find Fibonacci series for user defined number
a.	Input number :- 5
b.	Output :- 120
  */
public class Fibonaci_A3_7 {

	public static void main(String[] args) {
		{    
			int n1=0,n2=1,n3,i; 
			 Scanner sc = new Scanner (System.in);
			 System.out.println("Enter the number to print Fibonacci series :");
			 int num = sc.nextInt();
			 System.out.print(n1+" "+n2);    
			    
			 for(i=2;i<=num;++i)    
			 {    
				 n3=n1+n2;    
				 System.out.print(" "+n3);    
				 n1=n2;    
				 n2=n3;    
			 }    
			  
			}
		}
	}

