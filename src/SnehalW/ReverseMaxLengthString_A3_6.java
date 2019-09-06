package SnehalW;

import java.util.Scanner;

/*
6)	WAP to find reverse max length string 
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b.	Output Max length string :- Technocredits
c.	Max length string reverse value :- stiderconhcet

*/
public class ReverseMaxLengthString_A3_6 {
	String   Maxlenstr;
	String  reversemaxlenstr;
	String str[] = {"all the best", "technocredits", "", "maharashtra"};
	void reversestring()
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the string in array : ");
		//String strinput = sc.nextLine();
		
		  String maxlenstr = str[0];
		    for(int i = 0; i < str.length; i++)
		    { 
		    	if(maxlenstr.length() < str[i].length())
		    	{
		    		maxlenstr = str[i];
		    	}
		    }
	System.out.println("Maximum length of string is : "+ maxlenstr);
	System.out.print("Maximum length string reverse value : ");  
	for (int i = maxlenstr.length() - 1; i>=0; i--)
	{
	    System.out.print(maxlenstr.charAt(i));  
	}
}
	
	public static void main(String[] args) {
		ReverseMaxLengthString_A3_6 reversemaxlengthstring_A3_6 = new  ReverseMaxLengthString_A3_6();
		reversemaxlengthstring_A3_6.reversestring();
	}
}
