package AtulS;

public class Equality {

	void arraycomp(int[]a,int[] b)
	{
		boolean flag = true;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] != b[i])
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Array elements are equal");
		}
		else
		{
			System.out.println("Array elements are not equal");
		}
	}
	public static void main(String[] args) {
		int[] a = {21,57,11,37,24};
		int[] b = {21,57,11,37,24};
		Equality equal = new Equality();
		equal.arraycomp(a,b);
	}

}
