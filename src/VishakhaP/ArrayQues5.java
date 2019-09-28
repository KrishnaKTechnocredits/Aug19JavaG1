package VishakhaP;

public class ArrayQues5 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,5,4};
		int b;
		for(int i =0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
					b= arr[i];
					arr[i]=arr[j];
					arr[j]=b;
				}
			}
		}
		System.out.println("Second largest element is :" +arr[1]);
	}

}
