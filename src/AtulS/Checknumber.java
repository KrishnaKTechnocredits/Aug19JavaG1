//Check if array contains a number in Java
package AtulS;

public class Checknumber {

	String checknum(int[] arr, int num)
	{
		boolean flag = false;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			return "Number " + num + " match in given array";
		}
		else
		{
			return "Number " + num + " does not match in given array";
		}
	}
	public static void main(String[] args) {
		int[] arr = {12,15,14,19,78};
		Checknumber check = new Checknumber();
		System.out.println(check.checknum(arr, 19));
	}

}
