package VarshaT;

public class Asngmt2_Ques5 {

	void Max_Find(int a[])
	{
		int max1,max2=0;
		max1=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max1>a[i])
			{
				if(max2<a[i])
					max2=a[i];
			}
			else
			{
				max2=max1;
				max1=a[i];
			}
		}
		System.out.println("second largest no:"+ max2);
		
	}
	public static void main(String[] args) {
		int arr[]={2,6,9,3,11,10};
		Asngmt2_Ques5 asngmt2_Ques5= new Asngmt2_Ques5();
		asngmt2_Ques5.Max_Find(arr);

	}

}
