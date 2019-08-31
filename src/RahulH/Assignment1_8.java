class Assignment1_8
{
	String name = "aeiou";
	int sum = 0;
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	int sum4 = 0;
	
	void vowels()
	{
		for (int i=0; i<6; i++)
		{
			char c = name.charAt(i);
			char d = name.charAt(i);
			char f = name.charAt(i);
			char g = name.charAt(i);
			char h = name.charAt(i);
			
			if (c=='a')
			{
				sum = sum + 1;
			}
			else if (d=='e')
			{
				sum1 = sum1+1;
			}else if (f=='i')
			{
				sum2 = sum2+1;
			}else if (g=='o')
			{
				sum3 = sum3+1;
			}else if (h=='u')
			{
				sum4 = sum4+1;
			}
		}
		System.out.println("a: " +sum);
		System.out.println("e: " +sum1);
		System.out.println("i: " +sum2);
		System.out.println("o: " +sum3);
		System.out.println("u: " +sum4);
	}
	
	public static void main (String args[])
	{
		new Assignment1_8().vowels();
	}
}