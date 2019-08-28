package SnehalW;

public class MissingOneNumber 
{
	int i,j,sum=0,result;
	
	void findMissingNumber(int arr1[],int n)
	{
		for (i=0;i<arr1.length;i++)
		{
			int miss=(10*(10+1)/2);
			sum = sum + arr1[i];
			result = miss-sum;		
		}	
		System.out.println("The missing number is : "+result);
	}

	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,6,7,8,9,10};
		MissingOneNumber missingonenumber = new MissingOneNumber();		
		missingonenumber.findMissingNumber(arr1,5);

	}

}
