package ShreyaD;

import java.util.Scanner;

public class Assign4_p2 {

	void reverse(String str)
	{
		String rev="";
		String s1[]=str.split(" ");
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
		Assign4_p2 Program2= new Assign4_p2();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string : ");
		String str= sc.nextLine();
		Program2.reverse(str);
		sc.close();

	}

}
