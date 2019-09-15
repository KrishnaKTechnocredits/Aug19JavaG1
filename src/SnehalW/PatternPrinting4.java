package SnehalW;

public class PatternPrinting4 {
	
	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row = sc.nextInt();
		sc.close();
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				int v=0;
				if(j==1)
				{
					System.out.print(i);
				}
				else
				{
					v = i + (j-1)*2;
					System.out.print(v+ "" );
				}
			}
			System.out.println();
		}*/			
	}
}