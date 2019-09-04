package assignment_2;

public class Q13 {
	
	void reverse(int a[])
	{
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[] = {5, 6, 9, 10, 14, 63};
		new Q13().reverse(a);
	}

}
