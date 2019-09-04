package assignment_2;

public class Q9 {

	int cnt = 0;

	void differIndexArrays(int a[], int b[]) 
	{
		if (a.length == b.length) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] != b[i]) 
				{
					cnt = 1;
					System.out.println("Values are not matching at index " + i);
				}
			}
			if (cnt == 0) 
			{
				System.out.println("Arrays are same");
			}
		} else 
		{
			System.out.println("Lenght of arrays are not same");
		}
	}

	public static void main(String[] args) 
	{
		int a[] = { 10, 6, 18, 14, 8};
		int b[] = { 10, 2, 18, 14, 13 };

		new Q9().differIndexArrays(a, b);

	}

}
