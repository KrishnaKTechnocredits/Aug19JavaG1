package DimpleB;

public class ArrayProblem12 {
	void printcommonnumberintwoarrays(int input1[],int input2[])
	{
		int i,j,flag;
		for (i=0;i<input1.length;i++)
		{
			for(j=0;j<input1.length;j++)
			{
				flag=0;
				if(input1[i]==input2[j])
				{
					flag=1;
					System.out.println("Common number in both arrays is :"+input1[i]);
					break;
				}
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,6,9,7};
		int arr2[]={2,5,6,9,8};
		ArrayProblem12 arrayProblem12 = new ArrayProblem12();
		arrayProblem12.printcommonnumberintwoarrays(arr1,arr2);
	}

}
