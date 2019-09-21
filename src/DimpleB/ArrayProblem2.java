package DimpleB;


public class ArrayProblem2 {

	void findDuplicateNum(int input[])
	{
		int i,j;
		for (i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j])
					System.out.println("Number "+input[i]+" is duplicate in given array");
			}

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,1,2,3};
		ArrayProblem2 arrayproblem2 = new ArrayProblem2();
		arrayproblem2.findDuplicateNum(arr);
	}
}

