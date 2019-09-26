/*
 WAP to reverse a full String and particular word also.
Example:-
input = “there is an apple”
output = “elppanasiereht”
 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program2 {
	void reversestring(String inputstr)
	{
		int i=0;
		String rev="";
		for(i=inputstr.length()-1;i>=0;i--)
		{
			rev=rev.concat(inputstr.valueOf(inputstr.charAt(i)));
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		/*String str="there is an apple";
		String str1=str.replaceAll(" ", "");*/
		String str1=strip.replaceAll(" ", "");
		Assignment4program2 p2=new Assignment4program2();
		p2.reversestring(str1);
		sc.close();
				

	}

}
