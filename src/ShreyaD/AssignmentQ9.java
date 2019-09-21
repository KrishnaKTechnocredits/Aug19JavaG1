package ShreyaD;

public class AssignmentQ9 {
void Firstdiffindex(int arr1[],int arr2[])
{
	for(int i=0;i<arr1.length;i++)
	{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Values are not matching at index:"+i);
		}
	}
}

public static void main(String []args)
{
   int arr1[]= {10,2,9,14,3};     
   int arr2[]= {10,2,18,14,13};
   AssignmentQ9 Q9 = new AssignmentQ9();
   Q9.Firstdiffindex(arr1,arr2);
}
}