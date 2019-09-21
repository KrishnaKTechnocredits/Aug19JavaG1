//Find duplicate number on Integer array in Java
package AtulS;

public class Duplicatenum {

	void duplicate(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,5,4,6,5,8,7,3,10,9};
		Duplicatenum duplicate = new Duplicatenum();
		duplicate.duplicate(arr);
	}

}
