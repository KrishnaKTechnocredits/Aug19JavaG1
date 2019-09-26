/*3)	WAP to find frequency of user defined character in user defined String
a.	i.e. User String :- “electrical engineering”
b.	char value :- e
c.	count of e :- 5
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem3 {
	void charfreqcount(String inputstr,String ch)
	{
		int i=0,ecount=0;
		String str1=inputstr.replaceAll(" ", "");
		System.out.println(str1);
		for(i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='e')
			{
				ecount++;
			}
		}
		System.out.println("The occurrence of character "+ch+" is "+ecount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter complete input:");
		String strip=sc.nextLine();
		System.out.println("Enter character whose frequency to be checked :");
		String ch=sc.next();
		sc.close();
		StringArrayProblem3 strarrpro3=new StringArrayProblem3();
		strarrpro3.charfreqcount(strip,ch);
	}

}
