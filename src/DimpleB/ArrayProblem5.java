package DimpleB;

public class ArrayProblem5 {
	
	void findsecondLargest(int input[])
	{
		int i,max,secmax;
		max=input[0];
		secmax=input[0];
		for (i=0;i<input.length;i++)
		{
				
				if(input[i]>max)
				{
					secmax=max;
					max=input[i];

				}
				else if(input[i]>secmax)
				{
					secmax=input[i];
					
				}
			}
		
		System.out.println("Second largest element in given unsorted array is "+secmax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,3,9,11};
		ArrayProblem5 arrayproblem5 = new ArrayProblem5();
		arrayproblem5.findsecondLargest(arr);
	}

}
