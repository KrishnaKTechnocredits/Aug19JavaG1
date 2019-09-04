package assignment_2;

public class Q5 {
	
	int a[] = {23, 2, 45, 1, 9, 14, 5};
	int max = a[0];
	int secondmax = a[0];
	
	void secondLargest()
	{
		for (int i=0; i<a.length; i++)
		{
				if (max < a[i])
				{
					secondmax = max;
					max = a[i];
				}
				else if (a[i] > secondmax)
				{
					secondmax = a[i];
				}
		}
		System.out.println("Second maximum no. is: " +secondmax);
	}
	
	public static void main(String[] args) {
		
		new Q5().secondLargest();
		
	}

}
