package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q11 {
	
	char ch;
	String str2 = "";

	void palidrome(String str)
	{
		for (int i=str.length()-1; i>=0; i--)
		{	
			ch = str.charAt(i);
			str2 = str2 + Character.toString(ch);
			
		}
		System.out.print(str2);
		
		if (str2.equals(str))
		{
			System.out.println(" is palidrome");
		}else
		{
			System.out.println(" is not palidrome");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.next();
		System.out.println("The entered string is: " +str);
		
		new Q11().palidrome(str);
		sc.close();
		
	}

}
