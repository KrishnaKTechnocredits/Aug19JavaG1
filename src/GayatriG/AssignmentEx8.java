/*8)  You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. 
Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the string S. 
Approach: 
There are five vowels in English alphabet. Declare variables for five integers and initialize them as 0. 
Traverse the string S, character by character, check if the character is vowel. If it is, increment the count of that vowel by 1. 
Print out the count of each vowel after the iteration over the string is done. */
package GayatriG;
class AssignmentEx8
{
	static void display(String s)
	{
		//String s="Technocredits";
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)=='a')
			{
				a++;
			}
			else if(s.charAt(x)=='e')
			{
				e++;
			}
			else if(s.charAt(x)=='i')
			{
				i++;
			}
			else if(s.charAt(x)=='o')
			{
				o++;
			}
			else if(s.charAt(x)=='u')
			{
				u++;
			}
		}
		System.out.println("Count of A is: "+a+"\nCount of E is: "+e+"\nCount of I is: "+i+"\nCount of O is: "+o+"\nCount of U is: "+u);
	}
	public static void main(String args[])
	{
		display("welcome");
	}
}
