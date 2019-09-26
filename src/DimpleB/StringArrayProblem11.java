/*11)	WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321
reverse  of actual number :- 12321
*/

package DimpleB;
import java.util.Scanner;

public class StringArrayProblem11 {

	 void checknumpalindrome(String inputstr)
	{
		int i=0;
		String st = null;
		String st1 = "";
		String st2="";
		for(i=inputstr.length()-1;i>=0;i--)
		{
			char ch=inputstr.charAt(i);
			//System.out.println(ch);
			st=String.valueOf(ch);
			st1=st1.concat(st);
			if(st1.length()==inputstr.length())
			{
				st2=st1;
				break;
			}			
		}
		System.out.println("Reversed string is:  "+st2);
		if(inputstr.equalsIgnoreCase(st2)==true)
			System.out.println("User defined number is a palindrome");
		else
			System.out.println("User defined number is not a palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number to be checked:");
		String str=sc.next();
		sc.close();
		StringArrayProblem11 strnumpal=new StringArrayProblem11();
		strnumpal.checknumpalindrome(str);
		
	}

}
