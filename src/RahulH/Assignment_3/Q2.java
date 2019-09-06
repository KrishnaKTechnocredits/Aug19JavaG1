/*
 * When entered 1st string as "all the best", 2nd, 3rd string occupies string values as "the" and "best"
 */

package RahulH.Assignment_3;

import java.util.Scanner;

public class Q2 {
	
	int max =0;
	int ch = 0;
	
	void maxLenghtString(String str[])
	{	
		for (int i=0; i<str.length; i++)
		{
			ch = str[i].length();
			System.out.println(str[i] + " ->" + " length " +ch);
			if (ch > max)
			{
				max = ch;
			}
		}
		System.out.println("Max length is: " +max);
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size: ");
		int size = sc.nextInt();
		System.out.println("Entered size is: " + size);
		
		String str[] = new String [size];
		
		for (int i=0; i<str.length; i++)
		{
			System.out.println("Plese enter the " + (i+1) + " string");
			str[i] = sc.next();
		}
		
		//String s[] = {"all the best", "technocredits", "", "maharashtra"};
		new Q2().maxLenghtString(str);
		sc.close();
		
	}
}
