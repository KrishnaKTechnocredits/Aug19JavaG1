package DimpleB;


public class ArrayProblem3 {

	void findMissingNum(int input[],int number)
	{
		int i,flag=0;
		for (i=0;i<input.length;i++)
		{
			flag=0;
			if(input[i]!=number)
			{
				flag=1;

			}
		}
		if(flag==1)
			System.out.println("Number "+number+"  is missing in given array");

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {2,5,9,7,4,6};
		int num=8;
		ArrayProblem3 arrayproblem3 = new ArrayProblem3();
		arrayproblem3.findMissingNum(arr,num);
	}

}
