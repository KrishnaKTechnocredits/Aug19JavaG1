package Hemali;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3;
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for (int j=rows;j>=i;j--)
			{
			
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
