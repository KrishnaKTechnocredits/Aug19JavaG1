package ShreyaD;

public class AssignmentQ3 {
	void check(int arr[], int number)
	{    int cnt = 0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
			System.out.println("number is in array");
		else
			System.out.println("number is not in array");
	}

	
	
	
	public static void main(String []args)
	{
		int arr[] ={2,5,9,7,4,6};
		int number = 8;
		 AssignmentQ3 Q3 = new  AssignmentQ3();
		 Q3.check(arr,number);
	}
}
