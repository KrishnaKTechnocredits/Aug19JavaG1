package SnehalW;
//6)Write a java program to check the equality of two arrays?
public class ArrayEquality 
{
	int array1[] = {21, 57, 11, 37, 24};
	int array2[] = {21, 57, 11, 37, 24};
	int count;
	void equality()
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1.length ==array2.length && array1[i]==array2[j])
				{
					count++;
				}
			}
		}
		if(array1.length == count)
		System.out.println("Both the arrays are equals");
		else
			System.out.println("Both array are not equal");
			
	}
	public static void main(String[] args) 
	{
		ArrayEquality arrayequality = new ArrayEquality();
		arrayequality.equality();
		

	}

}
