package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q8 {
	
	void charNum(String s)
	{	
		for (int i=0; i<s.length(); i++)
		{
			char ch1 = s.charAt(i);
			int a = (int)ch1;
			
			if (a >= 97 && a <= 122)
			{
				System.out.print(s.charAt(i));
			}
		}
		
		System.out.print(" ");
		
		for (int i=0; i<s.length(); i++)
		{
			char ch2 = s.charAt(i);
			int b = (int)ch2;
			
			if (b >= 48 && b <= 57)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the string");
		String s = sc.next();
		//System.out.println("Entered string is: " +s);
		
		new Q8().charNum(s);
		sc.close();
	}
}
