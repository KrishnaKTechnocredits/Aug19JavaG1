//Largest and smallest number in unsorted array
package AtulS;

public class LargestSmallest {
	
	void findnum(int[] arr)
	{
		int max= arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
			
		}
		System.out.println("Largest and Smallest number in given array is " + max + " and " + min);
	}
	public static void main(String[] args) {
		int[] arr = {12,10,5,78,3};
		LargestSmallest lst = new LargestSmallest();
		lst.findnum(arr);

	}

}
