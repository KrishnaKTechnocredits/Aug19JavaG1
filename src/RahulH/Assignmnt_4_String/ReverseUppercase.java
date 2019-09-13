package RahulH.Assignmnt_4_String;

public class ReverseUppercase {
	
	String str = "Hi good morning all";
	String reverse[] = str.split(" ");
	
	void reverseUppercase()
	{
		for (int i=reverse.length-1; i>=0; i--)
		{
			//System.out.println(reverse[i]);
			
			
			for (int j=reverse[i].length()-1; j>=0; j--)
				{
					char c = reverse[i].charAt(j);
					String s = Character.toString(c);
					System.out.print(s.toUpperCase());
				}
			
		}
	}
	
	public static void main(String[] args) {
		
		new ReverseUppercase().reverseUppercase();
	}

}
