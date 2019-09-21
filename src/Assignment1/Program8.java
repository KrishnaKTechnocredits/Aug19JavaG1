package Assignment1;


class Program8
{
	void countvowel(String str)
	{
		int cnt=0;
		if(str!="")
		{
			for(int i=0;i<str.length();i++)
			{
				char v=str.charAt(i);
				if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
				{
					cnt++;
				}
			}
			System.out.println("Sum of all  vowels in given string is: "+cnt);
		}
	
	}
	
	public static void main(String args[])
	{
		String str="Str";
		Program8 program8=new Program8();
		program8.countvowel(str);
		
		
	}
}