package RahulH;

public class Q6 {

	int cnt = 0;

	void equility(int a[], int b[]) 
	{
		if (a.length == b.length) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] != b[i]) 
				{
					cnt = 1;
					System.out.println("Array not equal at index " + i);
					break;
				}
			}if (cnt == 0) 
			{
				System.out.println("Arrays are equal");
			}
		} else 
		{
			System.out.println("Length of both the array are not equal");
		}
	}

	public static void main(String[] args) {
		int a[] = { 21, 57, 11, 37, 24 };
		int b[] = { 21, 57, 11, 37, 24 };
		new Q6().equility(a, b);
	}

}
