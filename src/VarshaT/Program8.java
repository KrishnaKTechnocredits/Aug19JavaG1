/*
 8)	WAP to find vowels in given string 
a.	Input :- automation engineering
b.	Count :- 11

 */

package VarshaT;

import java.util.Scanner;

public class Program8 {

		void count(String s)
		{
			char c[]=s.toLowerCase().toCharArray();
			int count=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
					count++;
				}
			}
			System.out.println("count ="+ count);
		}
	public static void main(String[] args) {
		Program8 program8= new Program8();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str= sc.nextLine();
		program8.count(str);
		sc.close();
	}

}
