package DimpleB;

public class ArrayProblem6 {


	void arrayequality(int input1[],int input2[])
	{
		int i,flag=0;
		for (i=0;i<input1.length;i++)
		{
				if(input1[i]!=input2[i])
				{
					flag=1;
					System.out.println("Given arrays are not equal.");
					break;
				}
		}
		if(flag==0)
			System.out.println("Given arrays are equal.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {21,57,11,37,24};
		int arr2[]={21,57,11,37,24};
		ArrayProblem6 arrayproblem6 = new ArrayProblem6();
		arrayproblem6.arrayequality(arr1,arr2);
	}
}
