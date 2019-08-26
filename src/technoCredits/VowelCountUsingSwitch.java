package technoCredits;

public class VowelCountUsingSwitch {
	static int aCount;
	static int eCount;
	static int iCount;
	
	static void findVowel()
	{
		String input = "technocredits";
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			switch(ch)
			{
				case 'a' :
					aCount++;
					break;
					
				case 'e' :
					eCount++;
					break;	
			}
		}
		System.out.println("a count - " + aCount);
		System.out.println("e count - " + eCount);
		
		
	}
	public static void main(String[] args) {
		
		findVowel();
		
	}
}
