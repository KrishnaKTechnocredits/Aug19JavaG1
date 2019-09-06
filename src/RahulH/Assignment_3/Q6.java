/*
 *  1. Unable to find max string name, thus cannot reverse it.
 *  2. Unable to "all the best" as str[0]
 */

package assignment_4;

import java.util.Scanner;

public class Q6 {
	
	int max =0;
	int ch = 0;
	
	void maxString(String str[])
	{
		for (int i=0; i<str.length; i++)
		{
			ch = str[i].length();
			if (ch > max)
			{
				max = ch;
			}
		}
		System.out.println(max);
		for (int i=str.length; i>=0; i--)
		{
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		int size = sc.nextInt();
		System.out.println("The entered string is: " +size);
		
		String str[] = new String[size];
		
		for (int i=0; i<str.length; i++)
		{
			System.out.println("Please enter " + (i+1) + " string");
			str[i] = sc.next();
		}
		
		//String str[] = {"all the best", "technocredits", "", "maharashtra"};
		new Q6().maxString(str);
		sc.close();
	}

}
