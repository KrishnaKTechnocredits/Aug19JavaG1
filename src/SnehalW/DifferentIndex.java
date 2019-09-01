package SnehalW;
//8) Find first differ index from given arrays
public class DifferentIndex
{
	int array1[] = {10,2,9,14,3};
	int array2[] = {10,2,18,14,3};
	int i ,j;
		void differIndex()
		{
			for(i=0,j=0;i<array1.length;i++,j++)
			{
				if(array1[i]!=array2[j])
					{
						break;
					}
				}
			System.out.println("The arrays are not equal at the index : "+i);
		}
	public static void main(String[] args) 
	{
		DifferentIndex differentindex = new DifferentIndex();
		differentindex.differIndex();
	}
}
