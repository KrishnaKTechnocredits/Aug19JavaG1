package DimpleB;

public class ArrayProblem8 {

	void printfirstdifferedindex(int input1[],int input2[])
	{
		int i,flag=0;
		for (i=0;i<input1.length;i++)
		{
				if(input1[i]!=input2[i])
				{
					flag=1;
					System.out.println("First differ element is at index: "+i);
					break;
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {21,57,11,37,24};
		int arr2[]={21,57,11,27,24};
		ArrayProblem8 arrayproblem8 = new ArrayProblem8();
		arrayproblem8.printfirstdifferedindex(arr1,arr2);
	}

}
