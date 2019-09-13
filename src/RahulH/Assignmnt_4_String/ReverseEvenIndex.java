package assignment_4_String;

public class ReverseEvenIndex {
	
	String str = "This is techno credits";
	String str1[] = str.split(" ");
	
	void EvenIndex()
	{
		for (int i=0; i<str1.length; i++)
		{
			if (i%2==0)
			{
				//System.out.println(str1[i]);
				for (int j=str1[i].length()-1; j>=0; j--)
				{
					System.out.print(str1[i].charAt(j));
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		new ReverseEvenIndex().EvenIndex();
	}

}
