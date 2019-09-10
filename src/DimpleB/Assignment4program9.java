/*WAP to reverse the word.
Example:-
input :- hello good morning to all
output:-ollehdooggninromotlla
 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program9 {
	void reversestring(String inputstr)
	{
		int i=0,j=0;
		String strarr[]=inputstr.split(" ");
		String rev="";
		for(i=0;i<strarr.length;i++)
		{
			for(j=strarr[i].length()-1;j>=0;j--)
			{
				rev=rev.concat(strarr[i].valueOf(strarr[i].charAt(j)));
			}
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program9 p9=new Assignment4program9();
		p9.reversestring(strip);
		sc.close();
	}

}
