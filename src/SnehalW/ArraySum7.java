package SnehalW;
//7) Find all pairs on integer array whose sum is equal to given number?
public class ArraySum7 
{
		int array1[] = {2, 4, 3, 5, 7, 8, 9};
		int count;
		
		void sumnumber()
		{
			for(int i=0;i<array1.length;i++)
			{
				for(int j=i+1;j<array1.length;j++)
				{
					if(array1[i] + array1[j]==7)
					{
						System.out.println("The sum of "+ array1[i] +" and "+ array1[j] +" is 7" );
					}
				}
			}
		}
	public static void main(String[] args)
	{
		ArraySum7 arraysum7= new ArraySum7();
		arraysum7.sumnumber();
	}

}
