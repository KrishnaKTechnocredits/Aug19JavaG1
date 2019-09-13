package RahulH.PatternMatching;

public class Q5 {
	
	void pattern()
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=1; j--)
			{
				if (j>i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		new Q5().pattern();
	}

}
