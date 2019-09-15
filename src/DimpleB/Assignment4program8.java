/*
 separate digits and characters from the user define string.
Example:-
Hint:- using ASCII and Charater method
input:- a1b22sd5e2fw2sd3e
output:-absdefwsde 1225223
 */

package DimpleB;

import java.util.Scanner;
public class Assignment4program8 {
	void seperatealphanumericval(String inputstr)
	{
		String alphastr="";
		String numstr="";
		int i=0;
		for(i=0;i<inputstr.length();i++)
		{
			if(Character.isDigit(inputstr.charAt(i))==true)
				numstr=numstr.concat(inputstr.valueOf(inputstr.charAt(i)));
			else
				alphastr=alphastr.concat(inputstr.valueOf(inputstr.charAt(i)));
		}
		System.out.println(alphastr+" "+numstr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program8 p8=new Assignment4program8();
		p8.seperatealphanumericval(strip);
		sc.close();
	}

}
