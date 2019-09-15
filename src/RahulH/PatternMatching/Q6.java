package RahulH.PatternMatching;

public class Q6 {
	
	void pattern()
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
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
		
		new Q6().pattern();
	}

}
