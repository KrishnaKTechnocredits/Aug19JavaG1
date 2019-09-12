/* WAP to print output as below
 Please enter string:
Input:this is techno credits
Output:siht is onhcet credits
 */
package assignment4;
import java.util.Scanner;

public class Assignment4program13 {
	void reverseevenindexstring(String str)
	{
		int i=0;
		int j=0;
		String rev="";
		String[] strarr=str.split(" ");
		for(i=0;i<strarr.length;i++)
		{
			if(i%2==0)
			{
				for(j=strarr[i].length()-1;j>=0;j--)
				{
					rev=rev.concat(String.valueOf(strarr[i].charAt(j)));
				}
			}
			else
			{
				for(j=0;j<strarr[i].length();j++)
				{
					rev=rev.concat(String.valueOf(strarr[i].charAt(j)));
				}
			}
			rev=rev.concat(" ");
		}
		System.out.println("Expected string is:");
		System.out.println(rev);
	}
	public static void main(String[] args) {
	System.out.println("Please enter string:");
	Scanner sc=new Scanner(System.in);
	String strip=sc.nextLine();
	Assignment4program13 p13=new Assignment4program13();
	p13.reverseevenindexstring(strip);
	sc.close();
	}
}
