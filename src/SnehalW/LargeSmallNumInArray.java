package SnehalW;
//4) Largest and smallest number in unsorted array?
public class LargeSmallNumInArray
{
	int arr[]= {3,5,0,7,2,9};
	int i,min,max;
	void Max()
	{
		max=arr[0];
		for(i=1;i<arr.length;i++)
		{
				if(arr[i]>max)
				{
					max = arr[i]; 
				}
		}
		System.out.println("The Maximun number is :" + max);
		}
	void Min()
	{
		min=arr[0];
		for(int i=0; i<arr.length; i++ ) 
		{
	         if(arr[i]<min)
	         {
	            min = arr[i];
	         }
		}
		System.out.println("The Minimun number is :" + min);	
	}
		
	public static void main(String[] args)
	{
		LargeSmallNumInArray largesmallnuminarray =  new LargeSmallNumInArray();
		largesmallnuminarray.Max();
		largesmallnuminarray.Min();
	}
}
