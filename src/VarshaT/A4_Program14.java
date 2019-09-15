/*
 * WAP to make the string at odd index capital and reverse
 * i/p:- Hi Good Morning All
 * o/p:- LLA gninroM DOOG iH
 */

package VarshaT;

import java.util.Scanner;

public class A4_Program14 {
	void reverse(String s)
	{
	String s1[]= s.split(" ");
	String rev="",temp="";
	for(int i=s1.length-1;i>=0;i--)
	{
		temp="";
		for(int j=s1[i].length()-1;j>=0;j--)
		{
			temp+=String.valueOf(s1[i].charAt(j));
		}
		if(i%2!=0)
		{
			temp=temp.toUpperCase();
		}
		rev+=temp+" ";
	}
	System.out.println("reverse string: "+ rev);
	}

	public static void main(String[] args) {

		A4_Program14 a4_Program14= new A4_Program14();
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the string");
		String s= sc.nextLine();
		a4_Program14.reverse(s);
		sc.close();

	}

	
}
