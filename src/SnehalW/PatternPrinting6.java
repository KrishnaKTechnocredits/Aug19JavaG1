package SnehalW;

public class PatternPrinting6 {

	public static void main(String[] args) {
		int row=5;
		int maxstar=5;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
