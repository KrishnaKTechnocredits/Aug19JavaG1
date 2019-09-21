package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q9 {
	
	void reverse(String s)
	{
		String str[] = s.split(" ");
		
		for (int i=0; i<str.length; i++)
		{		
			for (int j=str[i].length()-1; j>=0; j--)
			{
				System.out.print(str[i].charAt(j));
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s = sc.nextLine();
		System.out.println("Entered string is: " +s);
		
		new Q9().reverse(s);
		sc.close();
	}
}
