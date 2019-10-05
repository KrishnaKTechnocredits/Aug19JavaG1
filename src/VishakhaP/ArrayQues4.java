package VishakhaP;

public class ArrayQues4 {
	public static void main(String args[]){
		int arr []={2,6,3,9,11};
		
		int min =arr[0];
		int max =arr[0];
		for(int i =0;i< arr.length;i++)
		{
			if (arr [i]< min){
				min = arr[i];
			}
			
			if (arr [i]> max){
				max = arr[i];
		}
			

	}
		System.out.println(" Smallest number: " + min + " largest number: " +max);
	}
		
	}


