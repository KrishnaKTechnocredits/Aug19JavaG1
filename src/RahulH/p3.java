package RahulH;

public class p3 {
	
	void pattern()
	{
		for (int i = 1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				int v=0;
				if (j==1)
				{
					System.out.print(i + " ");
				}
				else
				{
					v = i+(j-1)*2;
					System.out.print(v + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		new p3().pattern();
	}

}
