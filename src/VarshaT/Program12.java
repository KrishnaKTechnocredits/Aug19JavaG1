/*
 12)	WAP to find word is palindrome or not ?
a.	String name = “naman”
i.	Naman is palindrome
b.	String name = “harsh”
i.	Harsh is not palindrome

 */



package VarshaT;

import java.util.Scanner;

public class Program12 {
	void check(String str)
	{
		String rev_s="";
		char c[]=str.toCharArray(); 
		for(int i=c.length-1;i>=0;i--)
		{
			rev_s+=String.valueOf(c[i]);
		}
		if(str.equalsIgnoreCase(rev_s))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not a palindrome");
		
	}

	public static void main(String[] args) {
		Program12 program12 = new Program12();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str= sc.nextLine();
		program12.check(str);
		sc.close();
		
	}

}
