package SnehalW;
//3) Check if array contains a number in Java?
public class ArratContainNumber
{

	int i ;
	void containsNumber(int arr[],int n)
	{
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=n)
				break;					
		}
		System.out.println("The missing number is :" + n);
	}
	public static void main(String[] args)
	{
		int arr[] = {2,5,9,7,4,6};
		ArratContainNumber arratcontainnumber= new ArratContainNumber();		
		arratcontainnumber.containsNumber(arr,8);
	}

}
