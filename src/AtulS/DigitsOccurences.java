package AtulS;

public class DigitsOccurences {

	void occurence(String str)
	{
		for(int i = 0;i<str.length();i++)
		{
			int count = 1;
			for(int j = i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count = count+1;
				}
			}
			System.out.println("Digit " + str.charAt(i)+ " repeating " + count + " times");
		}
	}
	public static void main(String[] args) {
		DigitsOccurences digit = new DigitsOccurences();
		digit.occurence("128896");

	}

}
