/* WAP to find given string is palidrome or not
Example:-
#palidrome defines as The characters read the same backward as forward
1) input :- racecar
output:- racecar
2) input:-nitin
output:-nitin */

package DimpleB;

import java.util.Scanner;

public class Assignment4program11 {
	void palindromecheck(String inputstr)
	{
		int i=0;
		int j=0;
		String rev="";
		for(i=inputstr.length()-1;i>=0;i--)
		{
			rev=rev.concat(inputstr.valueOf(inputstr.charAt(i)));
		}
		if(inputstr.equalsIgnoreCase(rev))
			System.out.println("String "+inputstr+" is a palindrome");
		else
			System.out.println("String "+inputstr+" is not a palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program11 p11=new Assignment4program11();
		p11.palindromecheck(strip);
		sc.close();
	}

}
