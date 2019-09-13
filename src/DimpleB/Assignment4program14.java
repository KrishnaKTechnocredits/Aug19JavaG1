/* WAP to print output as below
 Please enter string:
Input:Hi Good Morning All
Output:llA GNINROM doog HI
 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program14 {

	void reversalstring(String str)
	{
		int i=0;
		String str1="";
		String st2="";
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1.concat(str.valueOf(str.charAt(i)));
		}
		String str2=str1;
		for(i=str2.indexOf("l");i<=str2.lastIndexOf("A");i++)
		{
			System.out.print(str2.charAt(i));
		}
		System.out.print(" ");
		for(i=str2.indexOf("g");i<=str2.lastIndexOf("M");i++)
		{
			st2=String.valueOf(str2.charAt(i));
			System.out.print(st2.toUpperCase());
		}
		System.out.print(" ");
		for(i=str1.indexOf("d");i<=str1.lastIndexOf("G");i++)
		{
			if(str1.charAt(i)=='G')
			{
				st2=String.valueOf(str1.charAt(i));
				System.out.print(st2.toLowerCase());
			}
			else
			{
				st2=String.valueOf(str1.charAt(i));
				System.out.print(st2);
			}
		}
		System.out.print(" ");
		String str3="";
		String str4="";
		str3=str3.concat(String.valueOf(str2.charAt(str2.lastIndexOf("i"))));
		str4=str4.concat(String.valueOf(str2.charAt(str2.lastIndexOf("H"))));
		System.out.print(str4.concat(str3).toUpperCase());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program14 p14=new Assignment4program14();
		p14.reversalstring(strip);
		sc.close();
	}

}
