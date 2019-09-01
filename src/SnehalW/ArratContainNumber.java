package SnehalW;
//3) Check if array contains a number in Java?
public class ArratContainNumber
{
	int i;
	void containsNumber(int arr1[],int num)
	{
		for(i=0; i<arr1.length; i++)
		{
			if(arr1[i] == num)
			{
				//break;
			}
			else
			{
				System.out.println("The number is " + num +" is not in array");
			}
		}
}
	public static void main(String[] args)
	{
		ArratContainNumber arratcontainnumber= new ArratContainNumber();		
		int arr1[] = {2,5,9,7,4,6};
		arratcontainnumber.containsNumber(arr1,2);
	}

}
