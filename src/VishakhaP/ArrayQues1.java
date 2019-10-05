package VishakhaP;

public class ArrayQues1 {
	public static void main (String args[])
	{
		int arr[]= {1,3,2,4,6,};
		int n = arr.length + 1;
		int sum = (n*(n+1))/2;
		for(int i = 0;i< arr.length;i++)
		{
			sum = sum - arr[i];
		}
		
		System.out.println("Missing number is: " +sum);
	}
	

}
