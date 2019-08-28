package loopExamples;

public class ArrayProblem9 {
	void printalldifferedindex(int input1[],int input2[])
	{
		int i,flag;
		for (i=0;i<input1.length;i++)
		{
				/*flag=0;*/
				if(input1[i]!=input2[i])
				{
					/*flag=1;*/
					System.out.println("Differed element is at index: "+i);
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,2,9,14,3};
		int arr2[]={10,2,18,14,13};
		ArrayProblem9 arrayproblem9 = new ArrayProblem9();
		arrayproblem9.printalldifferedindex(arr1,arr2);
	}


}
