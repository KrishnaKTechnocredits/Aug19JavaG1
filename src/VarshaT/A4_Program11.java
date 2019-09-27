/*
 *  11) WAP to find given string is palidrome or not Example:- #palidrome defines as The characters read the same backward as forward
 *     1) input :- racecar  output:- racecar   
 *     2) input:-nitin  output:-nitin
 */


package VarshaT;

import java.util.Scanner;

public class A4_Program11 {
	void palindrome(String s)
	{
		char a[]= s.toCharArray();
		String s1= "";
		for(int i=a.length-1;i>=0;i--)
		{
			s1=s1+String.valueOf(a[i]);
		}
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindome");
		}
	}

	public static void main(String[] args) {
		A4_Program11 a4_Program11 = new A4_Program11();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		a4_Program11.palindrome(s);
		sc.close();

	}

}
