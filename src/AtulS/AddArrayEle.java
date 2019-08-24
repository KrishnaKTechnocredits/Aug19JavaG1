//program to add the corresponding elements of two arrays, each of size N
class AddArrayEle
{
	int[] sumarrayelements(int[] x, int[] y)
	{
		int[] z = new int[x.length];
		for(int i = 0;i<x.length;i++)
		{
			z[i] = x[i] + y[i];
		}
		return z;
	}
	
	public static void main(String[] a)
	{
		int[] p = new int[0];
		int[] q = {10,10,10};
		int[] r = {50,30,0};
		AddArrayEle sum = new AddArrayEle();
		p = sum.sumarrayelements(q,r);
		for(int i = 0;i<p.length;i++)
		{
			System.out.println("Sum of array element is : "+p[i]);
		}
	}
}