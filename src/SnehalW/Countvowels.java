package SnehalW;
//8) You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the string S.
class Countvowels
{
	String str = "hello aeiou";
	int count = 0,i;
	
	void countv()
	{
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==('a')||str.charAt(i)==('e')||str.charAt(i)==('i')||str.charAt(i)==('o')||str.charAt(i)==('u'))
				count++;			
		}
		System.out.println("The count of vowels in string are :" + count);		
	}
	
	public static void main(String args[])
	{
	Countvowels countvowels = new Countvowels();
	countvowels.countv();
	}
} 