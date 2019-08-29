//Find all differ index from given arrays
package AtulS;

public class DifferIndex2 {

	void differarrays(int[] arr, int[] arr1)
	{
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i] != arr1[i])
				{
					System.out.println("Value are not matching at index: " + i);
				}
					
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,2,9,14,3};
		int[] arr1 = {10,2,18,15,13};
		DifferIndex2 differ = new DifferIndex2();
		differ.differarrays(arr, arr1);

	}

}

