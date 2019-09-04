/* Hello Reviewer (Maulik/Krishna/Harsh),
 * I am unable to think on this program logic. Whereas I am able to print unique numbers.
 */

package assignment_2;

public class Q11 {

	/*
	 * void uniqueNos(int a[], int b[]) { if (a.length == b.length) { for (int
	 * i=0; i<a.length; i++) { for (int j=0; j<b.length; j++) { if (a[i] ==
	 * b[j]) { System.out.print(a[i]); } } } } }
	 */

	public static void main(String[] args) 
	{
		
		int a[] = {1, 3, 6, 9, 7};
		int b[] = {2, 5, 6, 9, 8};
		int c [] = new int[a.length+b.length];
		c[0]=a[0];
		int index=1;
		
		for(int i=1;i<a.length;i++)
		{
			boolean flag = true;
			
			for(int j=0; j<c.length; j++)
			{
				if (a[i] == c[j])
				flag = false;
			}
			if(flag == true)
			{
				c[index] = a[i];
			}
	}
	}
	}
