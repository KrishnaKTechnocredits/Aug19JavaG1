package DimpleB;

public class ArrayProblem4 {

	void findlargestsmallest(int input[])
	{
		int i,largest=input[0],smallest=input[0];
		for (i=0;i<input.length;i++)
		{
			if(input[i]>largest)
			{
				largest=input[i];
			}
			if(input[i]<smallest)
			{
				smallest=input[i];
			}

		}
		System.out.println("Largest number in given unsorted array is :"+largest);
		System.out.println("Smallest number in given unsorted array is :"+smallest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,3,9,11};
		ArrayProblem4 arrayproblem4 = new ArrayProblem4();
		arrayproblem4.findlargestsmallest(arr);
	}
}
