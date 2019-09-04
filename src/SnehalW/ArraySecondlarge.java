package SnehalW;

//5)Write a java program to find second largest element in an array of integers?

public class ArraySecondlarge {
	
	public static void main(String[] args) {
		int arr[]= {10,1,2,4,5,7,9,100};
		int temp;
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Second largest number in array is :"+arr[arr.length-2]);
	}
}
