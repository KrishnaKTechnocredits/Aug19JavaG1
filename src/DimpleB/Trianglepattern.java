package DimpleB;

class Trianglepattern
{
	void printtrianglepattern()
	{
		int i,j,n;
		for(i=0;i<5;i++)
		{
			n=5;
			for(j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Trianglepattern tr= new Trianglepattern();
		tr.printtrianglepattern();
	}
}