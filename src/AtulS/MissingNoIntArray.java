//Find the missing number in integer array of 1 to 10
package AtulS;

public class MissingNoIntArray {

	int onemissingnumber(int[] arr)
	{
		int sum = 0;
		for(int itr = 0;itr<arr.length;itr++)
		{
			sum = sum + arr[itr];
		}
		return 55-sum;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5,4,6,3,9,8,10};
		MissingNoIntArray arrobj = new MissingNoIntArray();
		System.out.println(arrobj.onemissingnumber(arr));

	}

}
