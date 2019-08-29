package AtulS;

public class DifferIndex {

	void differarrays(int[] arr, int[] arr1)
	{
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i] != arr1[i])
				{
					System.out.println("Value are not matching at index: " + i);
					break;
				}
					
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,2,9,14,3};
		int[] arr1 = {10,2,18,14,3};
		DifferIndex differ = new DifferIndex();
		differ.differarrays(arr, arr1);

	}

}
