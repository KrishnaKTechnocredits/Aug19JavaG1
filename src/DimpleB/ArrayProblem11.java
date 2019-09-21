package DimpleB;

public class ArrayProblem11 {
	void printuniquenumbers(int input1[],int input2[])
	{
		int i;
		System.out.println("Unique elements in both arrays are:");
		for(i=0;i<input1.length;i++)
		{
			System.out.println(input1[i]);
		}		
		for (i=0;i<input2.length;i++)
		{
				if(input2[i]!=input1[i])
				{
					System.out.println(input2[i]);
				}
			}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,6,9,7};
		int arr2[]={2,5,6,9,8};
		ArrayProblem11 arrayProblem11 = new ArrayProblem11();
		arrayProblem11.printuniquenumbers(arr1,arr2);
	}
}
