package DimpleB;

public class ArrayProblem13 {
	void printarrayinreverse(int input[],int output[])
	{
		int i;
		for (i=input.length-1;i>=0;i--)
		{
				output[i]=input[i];
				System.out.println("Element in reverse array at index "+i+" is "+output[i]);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,9,10,14,63};
		int revarr[]=new int[arr.length];
		ArrayProblem13 arrayProblem13 = new ArrayProblem13();
		arrayProblem13.printarrayinreverse(arr,revarr);
	}
}
