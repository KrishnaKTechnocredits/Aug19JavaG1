//WAP to reveres array
package AtulS;

public class ReverseArray {

	void reverse(int[] arr)
	{
		for(int j = arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,522,389,4,5};
		ReverseArray rev = new ReverseArray();
		rev.reverse(arr);

	}

}
