package SnehalW;

public class Patternprinting1 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");  
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		String str="snehal";
		String newstr= str.substring(0, 3);
		System.out.println(newstr);
		
		
	}
}