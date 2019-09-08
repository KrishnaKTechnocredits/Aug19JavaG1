package RahulH.Assignment_3;

import java.util.Scanner;

public class Q15 {
	
	int wordlength=0;
	int length = 7;
	
	void maxString(String str[])
	{
		for (int i = 0; i<str.length; i++)
		{
			wordlength = str[i].length();
			if (wordlength >= length)
			{
				System.out.println(str[i] + wordlength);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Entered string array size " + size);
		
		String str[] = new String[size];
		
		for (int i=0; i<str.length; i++)
		{
			System.out.println("Please enter the " +(i+1) + " value: ");
			str[i] = sc.next();
		}
		
		new Q15().maxString(str);
		sc.close();
	}

}
