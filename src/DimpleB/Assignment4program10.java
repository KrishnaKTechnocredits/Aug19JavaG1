/*WAP to character occurring in user defined String and Character
Example :-
InputString :- hello how are you harsh?
Input char :- h
Output:- char is : h and number of occurrence = 4. */

package DimpleB;

import java.util.Scanner;

public class Assignment4program10 {

	void freqcheck(String inputstr,String ch)
	{
		int count=0,i=0,j=0;
		String strarr[]=inputstr.split(" ");
		for(i=0;i<strarr.length;i++)
		{
			for(j=0;j<=strarr[i].length()-1;j++)
			{
				if(strarr[i].valueOf(strarr[i].charAt(j)).equalsIgnoreCase(ch))
				{
					count++;
				}
			}
		}		
		System.out.println("Frequency of character "+ch+" in given string "+inputstr+" is :"+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		System.out.println("Please enter character whose frequency to be checked:");
		String ch=sc.next();
		Assignment4program10 p10=new Assignment4program10();
		p10.freqcheck(strip,ch);
		sc.close();
	}
}
