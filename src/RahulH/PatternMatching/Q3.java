package RahulH.PatternMatching;

public class Q3 {
	
	void pattern()
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=4; j>=1; j--)
			{
				if (j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		 
		new Q3().pattern();
	}

}
