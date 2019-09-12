/* WAP to print output as below
 Please enter string:
Input:Hi Good Morning All
Output:lla GNINROM doog IH
 */
package DimpleB;
import java.util.Scanner;

public class Assignment4program14 {
	void reverseevenindexstring(String str)
	{
		int i=0;
		int j=0;
		String rev="";
		String str1="";
		String str3="";
		String str4="";
		System.out.println("Expected output string is:");
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1.concat(String.valueOf(str.charAt(i)));
		}
		String str2=str1;
		String[] strarr=str2.split(" ");
		for(i=0;i<strarr.length;i++)
		{
			rev="";
			if(i%2==0)
			{
				for(j=0;j<strarr[i].length();j++)
				{
					rev=rev.concat(String.valueOf(strarr[i].charAt(j)));
					str3=rev.toLowerCase();
				}
				System.out.print(str3+" ");
			}
			else
			{
				for(j=0;j<strarr[i].length();j++)
				{
					rev=rev.concat(String.valueOf(strarr[i].charAt(j)));
					str4=rev.toUpperCase();
				}
				System.out.print(str4+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program14 p14=new Assignment4program14();
		p14.reverseevenindexstring(strip);
		sc.close();
		}
}
