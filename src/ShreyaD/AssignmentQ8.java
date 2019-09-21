package ShreyaD;

public class AssignmentQ8 {
void Firstdiffindex(int arr1[],int arr2[])
{
	for(int i=0;i<arr1.length;i++)
	{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Values are not matching at index:"+i);
				break;
		}
	}
}

public static void main(String []args)
{
   int arr1[]= {10,2,9,14,3};     
   int arr2[]= {10,2,18,14,13};
   AssignmentQ8 Q8 = new AssignmentQ8();
   Q8.Firstdiffindex(arr1,arr2);
}
}