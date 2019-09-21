package DimpleB;

public class ArrayProblem10 {
	void maxdifferedelement(int input1[],int input2[])
	{
		int i;
		for (i=0;i<input1.length;i++)
		{
			if(input1[i]!=input2[i])																																																
			{
				if(input1[i]>input2[i])
				{
					System.out.println("Maximum between differed elements  is : "+input1[i]);
					break;
				}
				System.out.println("Maximum between differed elements  is : "+input2[i]);
			}

		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		ArrayProblem10 arrayproblem10 = new ArrayProblem10();
		arrayproblem10.maxdifferedelement(arr1, arr2);
	}
}
