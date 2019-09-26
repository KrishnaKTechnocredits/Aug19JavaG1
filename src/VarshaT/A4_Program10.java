/*
 *  10) WAP to character occurring in user defined String and Character Example :-  
 *  InputString :- hello how are you harsh? 
 *   Input char :- h  
 *   Output:- char is : h and number of occurrence = 4.  
 */

package VarshaT;

import java.util.Scanner;

public class A4_Program10 {

	void char_count(String s,char c)
	{
		int initial=s.length();
		int finl=s.replaceAll(String.valueOf(c), "").length();
		System.out.println("count of "+c+" in "+s+" is="+(initial-finl));
		
	}
	public static void main(String[] args) {
		A4_Program10 a4_Program10 = new A4_Program10();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		System.out.println("enter the character whose count to be calculated:");
		char c= sc.next().charAt(0);
		a4_Program10.char_count(s,c);
		sc.close();


	}

}
