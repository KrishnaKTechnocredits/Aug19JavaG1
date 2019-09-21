//WAP to print even number from the array
package AtulS;

public class EvenNumber {

	void printeven(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,522,389,4,5};
		EvenNumber even = new EvenNumber();
		even.printeven(arr);
	}

}
