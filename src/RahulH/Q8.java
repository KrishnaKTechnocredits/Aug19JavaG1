package RahulH;

public class Q8 {

	int cnt = 0;

	void differ(int a[], int b[]) 
	{
		if (a.length == b.length) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] != b[i]) 
				{
					cnt = 1;
					System.out.println(" Values are not matching at index -> " + i);
					break;
				}
			}
			if (cnt == 0) 
			{
				System.out.println("Arrays are equal");
			}
		} else 
		{
			System.out.println("Length not same");
		}

	}

	public static void main(String[] args) 
	{
		int a[] = { 10, 2, 18, 1, 3 };
		int b[] = { 10, 2, 18, 14, 3 };
		new Q8().differ(a, b);
	}
}
