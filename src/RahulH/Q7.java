package RahulH;

public class Q7 {
	
	int sum = 7;
	
	void m1(int a[])
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (a[i]+a[j]==sum)
					System.out.println("("+ a[i] + "," +a[j]+")");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {2, 4, 3, 5, 7, 8, 9};
		new Q7().m1(a);
	}

}
