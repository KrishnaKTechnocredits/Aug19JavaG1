/*
 * WAP to reverse elements at even index in string array:-
 * i/p:- this is techno credits
 * o/p:- siht is onhcet credits
 */

package VarshaT;

import java.util.Scanner;

public class A4_Program13 {
	void reverse(String s)
	{
	String s1[]= s.split(" ");
	String rev="",temp="";
	for(int i=0;i<s1.length;i++)
	{
		temp="";
		if(i%2==0)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				temp+=String.valueOf(s1[i].charAt(j));
			}
		}
		else
		{
			temp=s1[i];
		}
		rev+=temp+" ";
	}
	System.out.println("reverse string: "+ rev);
	}

	public static void main(String[] args) {

		A4_Program13 a4_Program13= new A4_Program13();
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the string");
		String s= sc.nextLine();
		a4_Program13.reverse(s);
		sc.close();

	}

}
