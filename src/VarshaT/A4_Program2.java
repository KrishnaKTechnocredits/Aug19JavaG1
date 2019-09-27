/*
 * 2) WAP to revers a full String and particular word also.
 *  Example:-  input = “there is an apple”  output = “elppanasiereht” 
 */
package VarshaT;

import java.util.Scanner;

public class A4_Program2 {
	void reverse(String s)
	{
		String rev="";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				rev+=s1[i].charAt(j);
			}
		}
		System.out.println("reverse string:"+rev);
	}

	public static void main(String[] args) {
		A4_Program2 a4_Program2= new A4_Program2();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string : ");
		String s= sc.nextLine();
		a4_Program2.reverse(s);
		sc.close();

	}

}
