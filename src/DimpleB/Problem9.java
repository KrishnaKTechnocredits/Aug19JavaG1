package DimpleB;

public class Problem9 {
	static void charFreq(String input,char ch)
	{
		int i;
		int count = 0;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+ " : "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="character";
		int index;
		 /*String a=input.toLowerCase();
		 System.out.println(a);*/
		for(index=0;index<input.length();index++)
		{
			if(index==input.indexOf(input.charAt(index)))
				charFreq(input,input.charAt(index));
				
		}
	}

}

