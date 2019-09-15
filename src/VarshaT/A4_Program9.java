/*
 *9) WAP to reverse the word. Example:-  
 *input :- hello good morning to all  
 *output:-ollehdooggninromotlla  
 */
package VarshaT;

import java.util.Scanner;

public class A4_Program9 {
	void reverse(String s)
	{
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				s2+=String.valueOf(s1[i].charAt(j));
			}
		}
		System.out.println("reverse String:"+s2);
	}

	public static void main(String[] args) {
		A4_Program9 a4_Program9 = new A4_Program9();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		a4_Program9.reverse(s);
		sc.close();


	}

}
