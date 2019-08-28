package DimpleB;

public class ArrayProblem14 {
	void printevenelements(int input[])
	{
		int i;
		for (i=0;i<input.length;i++)
		{
				if(input[i]%2==0)
				{
					System.out.println("Element "+input[i]+" at index "+i+" is even");
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,24,52,49,62,10};
		ArrayProblem14 arrayproblem14 = new ArrayProblem14();
		arrayproblem14.printevenelements(arr);
	}
}
