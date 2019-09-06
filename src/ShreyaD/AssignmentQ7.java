package ShreyaD;

public class AssignmentQ7 {
	void checksum(int arr[],int number)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{	
			System.out.println("("+arr[i]+","+arr[j]+")");		
				}
			}
		}
	}
	public static void main(String []args)
	{
		int arr[] ={2, 4, 3, 5, 7, 8, 9 };
		int number =7;
		AssignmentQ7 Q7 = new AssignmentQ7();
		Q7.checksum(arr,number);
	}

}
