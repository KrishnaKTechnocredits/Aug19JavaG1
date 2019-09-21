package DimpleB;

public class ArrayProblem7 {

	void sumofpairequalnumber(int input[],int number)
	{
		int i,j;
		for (i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[i]+input[j]==number)
				{
					System.out.println("Sum of two elements of  "+input[i]+" and "+input[j]+" is = "+number);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,3,5,7,8,9};
		int num=7;
		ArrayProblem7 arrayproblem7 = new ArrayProblem7();
		arrayproblem7.sumofpairequalnumber(arr,num);
	}
}
