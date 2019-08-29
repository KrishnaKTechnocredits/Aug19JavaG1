package SnehalW;

public class DuplicateNumArray
{
	int []arr1= {0, 3, 1, 2, 3};
	int count,i,j;
	
	void displayDuplicate()
	{
		for (i=0;i<arr1.length;i++)
		{
			for(j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println("The duplicate number in the array is : "+arr1[i]);
				}					
			}
		}
	}
	public static void main(String[] args) 
	{
		DuplicateNumArray duplicatenumArray = new DuplicateNumArray();
		duplicatenumArray.displayDuplicate();

	} 

}
