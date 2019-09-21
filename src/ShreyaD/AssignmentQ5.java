package ShreyaD;

public class AssignmentQ5 {
	void Max(int a[])
	{
		int max1,max2=0;
		max1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max1>a[i]){
				if(max2<a[i])
					max2=a[i];
			}
			else{
				max2=max1;
				max1=a[i];
			}
		}
		System.out.println("second max number is"+max2);
	}

	
	public static void main(String []args){
		
	
	 int a[]={2,6,9,3,11,10};
	AssignmentQ5 Q5 = new AssignmentQ5();
	Q5.Max(a);
}
}
