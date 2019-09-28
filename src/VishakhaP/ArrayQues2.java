package VishakhaP;

public class ArrayQues2 {
	public static void main (String args[]){
		int arr[]= {1,4,2,2,6,7,6,9};
		for(int i = 1;i<arr.length-1;i++)
		{
			for(int j = i+1;j<arr.length-1;j++)
			{
			if (arr[i] == arr[j])
			{
				System.out.println("duplicate element is :" +arr[j]);
			}
		}
	}
	

	}
}
