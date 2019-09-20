package verifyOutput;

public class Pattern7 {
	
	static void pattern7()
	{
		int row =4;
		
		for (int i=1; i<=5; i++)
		{
			for (int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=row; i++)
		{
			for (int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			
			for (int j=row; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		pattern7();
	}

}
