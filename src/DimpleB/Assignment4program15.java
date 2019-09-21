/* WAP to print below string:
 Input:Hi Good Morning All
Output:llA gninroM dooG iH
 */
package DimpleB;

import java.util.Scanner;

public class Assignment4program15 {
	void reversestring(String str)
	{
		int i=0;
		String str1="";
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1.concat(str.valueOf(str.charAt(i)));
		}
		System.out.println("Reversed string is:"+str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program15 p15=new Assignment4program15();
		p15.reversestring(strip);
		sc.close();
	}

}
