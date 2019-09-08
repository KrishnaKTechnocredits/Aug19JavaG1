/*
 3)	WAP to find frequency of user defined character in user defined String
a.	i.e. User String :- “electrical engineering”
b.	char value :- e
c.	count of e :- 5

 */
package VarshaT;
import java.util.Scanner;
public class Program3 {

		void freq(String str, char c)
		{
			String s[]=str.split("e");
			if(str.charAt(str.length()-1)=='e')
			{
				System.out.println("char value:"+c);
				System.out.println("char count:"+s.length);
			}
			else
			{
				System.out.println("char value:"+c);
				System.out.println("char count:"+(s.length-1));
			}
			
		}
	public static void main(String[] args) {
		Program3 program3= new Program3();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String str= sc.nextLine();
		System.out.println("enter the character whose frequency to be calculated:");
		char c=sc.next().charAt(0);
		program3.freq(str,c);
		sc.close();
	}

}
