package AtulS;

public class SecondLargest {

	void secondlargestnum(int[] arr)
	{
		int frstlargest  = arr[0];
		int secondlargest = arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] > frstlargest)
			{
				secondlargest = frstlargest;
				frstlargest = arr[i];
			}
			else if(arr[i] > secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("Second Largest number in given array is " + secondlargest);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		SecondLargest sc = new SecondLargest();
		sc.secondlargestnum(arr);
		
	}

}
