/*
 *6)	WAP to find reverse max length string 
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b.	Output Max length string :- Technocredits
c.	Max length string reverse value :- stiderconhcet

 */

package VarshaT;

import java.util.Scanner;

public class Program6 {
	void reverse(String arr[])
	{
		int count=0;
		String s=null,rev_s="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>count)
			{
				count=arr[i].length();
				s=arr[i];
			}
		}
		System.out.println("Max length string: "+ s);
		char c[]=s.toCharArray(); 
		for(int i=c.length-1;i>=0;i--)
		{
			rev_s+=String.valueOf(c[i]);
		}
		System.out.println("reverse string: "+rev_s);
	}

	public static void main(String[] args) {
		Program6 program6= new Program6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size= sc.nextInt();
		sc.nextLine();
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the string");
			arr[i]=sc.nextLine();
		}
		program6.reverse(arr);
		sc.close();
	}

}
