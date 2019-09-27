/*12)	WAP to find word is palindrome or not ?
a.	String name = “naman”
i.	Naman is palindrome
b.	String name = “harsh”
i.	Harsh is not palindrome
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem12 {

	 void checkstrpalindrome(String str)
	{
		int i=0;
		String st = null;
		String st1 = "";
		String st2="";
		for(i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			//System.out.println(ch);
			st=String.valueOf(ch);
			st1=st1.concat(st);
			if(st1.length()==str.length())
			{
				st2=st1;
				break;
			}			
		}
		System.out.println("Reversed string is:  "+st2);
		if(str.equalsIgnoreCase(st2)==true)
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string to be checked:");
		String str=sc.next();
		sc.close();
		StringArrayProblem12 strpal=new StringArrayProblem12();
		strpal.checkstrpalindrome(str);
		
	}

}
