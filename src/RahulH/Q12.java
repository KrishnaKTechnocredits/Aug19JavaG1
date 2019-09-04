package assignment_2;

public class Q12 {
	
	int cnt = 0;
	
	void uniqueNos(int a[], int b[])
	{
		for (int i = 0; i<a.length; i++)
		{
			if (a[i] == b[i])
			{
				cnt = 1;
				System.out.print(a[i] + " ");
			}
		}
		if (cnt == 0)
		{
			System.out.println("No duplicate nos.");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1, 3, 6, 9, 7};
		int b[] = {2, 5, 6, 9, 8};
		
		new Q12().uniqueNos(a, b);
	}

}
