package SnehalW;
/*9)WAP to find average of user given array
a.	Input :- {14, 32, 19, 14, 78,36}
b.	Output:- 32.16
*/
public class FindAvg_A3_9 {
	 double avg=0;
	void calculateAvg()
	{
		double sum=0;
		int arr[]={14, 32, 19, 14, 78,36};
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("The average of array elements is: "+avg);
	}
	public static void main(String[] args) {
		FindAvg_A3_9 findavg_A3_9 = new FindAvg_A3_9();
		findavg_A3_9.calculateAvg();	
	}

}
