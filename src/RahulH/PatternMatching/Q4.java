package RahulH.PatternMatching;

public class Q4 {
	
	void pattern()
	{
		for (int i=0; i<=4; i++)
		{
			for (int j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		new Q4().pattern();
		
	}

}
