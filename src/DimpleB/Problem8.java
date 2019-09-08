package DimpleB;

class Problem8
{
	void countvowel(String str)
	{
		int vowelcnt=0;
		if(str!="")
		{
			for(int i=0;i<str.length();i++)
			{
				char v=str.charAt(i);
				if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
				{
					vowelcnt++;
				}
			}
			System.out.println("Sum of all occurrences of all vowels in given string is: "+vowelcnt);
		}
		System.out.println("String is empty!");
	}
	public static void main(String args[])
	{
		String str="Str";
		new Problem8().countvowel(str);
	}
}