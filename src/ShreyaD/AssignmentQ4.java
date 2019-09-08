package ShreyaD;

public class AssignmentQ4 {
	void check(int arr[],int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{	
			System.out.println("("+arr[i]+","+arr[j]+")");		
				}
			}
		}
	}
	public static void main(String []args)
	{
		int arr[] = {2, 6, 3, 9, 11};
		int sum =9;
		AssignmentQ4 Q4 = new AssignmentQ4();
		Q4.check(arr,sum);
	}
}

