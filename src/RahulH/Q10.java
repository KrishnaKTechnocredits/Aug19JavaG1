package assignment_2;

public class Q10 {
	
	int cnt = 0;
	
	void maxValue(int a[], int b[])
	{
		if (a.length == b.length)
		{
			for (int i=0; i<a.length; i++)
			{
				if (a[i]!=b[i])
				{
					cnt = 1;
					System.out.println("Miss match at index " + i + " and the numbers are " + a[i] + " and " + b[i]);
					if (a[i]<b[i])
					{
						System.out.println("The greater number is: " +b[i]);
					}
					else
					{
						System.out.println("The greater number is: "+a[i]);
					}
				}
			}
			if (cnt == 0)
			{
				System.out.println("Arrays match so no greater number");
			}
		}else
		{
			System.out.println("Array length do not match");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,2,9,14,3};
		int b[] = {10,2,18,14,3};
		
		new Q10().maxValue(a, b);
	}

}
