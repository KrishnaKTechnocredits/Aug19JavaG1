package loopExamples;


public class ArrayProblem1 {
	void findMissingNum(int input[])
	{
		int i,flag=0,j;
		for (i=0;i<input.length;i++)
		{
			flag=0;
			j=i+1;
			if(j!=input[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Number "+(i+1)+"  is missing in given array");

	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,7,8,9,10};
		ArrayProblem1 arrayproblem1 = new ArrayProblem1();
		arrayproblem1.findMissingNum(arr);
	}

}
