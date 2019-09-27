package ShreyaD;

import java.util.Scanner;

public class program2 {

	void ternary(int n1 ,int n2){
		
		int  max;  
	    max = (n1 > n2) ? n1 : n2;   
	    System.out.println("Largest number between " + n1 + " and " + n2 + " is " + max + ". " ); 
	}
	
	public static void main(String args[])  
	{
		program2 p2 = new program2();
		Scanner sc = new Scanner(System.in);
   		System.out.println("please enter the no");
   		int n1 = sc.nextInt();
   		int n2 = sc.nextInt();
   		p2.ternary(n1,n2);
   		sc.close();
	}
	} 

