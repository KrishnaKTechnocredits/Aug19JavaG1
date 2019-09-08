package SnehalW;

import java.util.Scanner;
/*
WAP to find frequency of user defined character in user defined String
a.	i.e. User String :- “electrical engineering”
b.	char value :- e
c.	count of e :- 5
*/
public class FreqChar_3_3 {
	
static int count=0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter the Character value : " );
		char ch = sc.next().charAt(0);
			
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)== ch )
			{
			 count++;	
			}
		}
		System.out.println("count of  : "+ch +" is "+ count);
	}
}
