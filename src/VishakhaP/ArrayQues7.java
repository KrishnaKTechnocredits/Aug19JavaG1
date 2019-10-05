package VishakhaP;

public class ArrayQues7 {
	public static void main(String args[])
	{
		int arr[]={2,4,3,5,7,8,9};
		int sum = 7;
		int low = 0;
		int high = arr.length-1;
		 while(low < high){
			 if (arr[low]+arr [high]>sum){
				high--;
			 }else if (arr[low]+arr [high]< sum){
					low++;
			 
			 }else if (arr[low]+arr [high] == sum){
				 System.out.println("pair("+ arr [low]+" ," + arr[high] +")");
					low++;
			 
			 }
			 
		 }
			 
		
	}

}
