package assignment_2;

public class Q4 {
	
	int a[] = {2, 6, 3, 9, 11};
	int max = a[0];
	int min = a[0];
	
	void m1()
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (max < a[j])
				{
					max = a[j];
				}
				if (min > a[j])
				{
					min = a[j];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void main(String[] args) 
	{
		new Q4().m1();
	}

}
