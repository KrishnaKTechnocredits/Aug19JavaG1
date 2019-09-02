/*8)	WAP to find vowels in given string 
a.	Input :- automation engineering
b.	Count :- 11
*/

import java.util.Scanner;

public class StringArrayProblem8 {
	void strvowelcount(String inputstr)
	{
		int i=0,vowelcount=0;
		if(inputstr.contains(" "))
		{
			inputstr=inputstr.replaceAll(" ", "");
			System.out.println(inputstr);
		}
		
		for(i=0;i<inputstr.length();i++)
		{
			if(inputstr.charAt(i)=='e'||inputstr.charAt(i)=='a'||inputstr.charAt(i)=='i'||inputstr.charAt(i)=='o'||inputstr.charAt(i)=='u'||inputstr.charAt(i)=='A'||inputstr.charAt(i)=='E'||inputstr.charAt(i)=='I'||inputstr.charAt(i)=='O'||inputstr.charAt(i)=='U')
			{
				vowelcount++;
			}
		}
		System.out.println("The vowel count in given string is "+vowelcount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter complete input:");
		String strip=sc.nextLine();
		sc.close();
		StringArrayProblem8 strarrpro8=new StringArrayProblem8();
		strarrpro8.strvowelcount(strip);
	}

}
