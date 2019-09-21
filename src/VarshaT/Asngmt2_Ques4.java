package VarshaT;

public class Asngmt2_Ques4 {
	void Find(int a[], int sum)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]={2,6,3,9,11},sum=9;
		Asngmt2_Ques4 asngmt2_Ques4= new Asngmt2_Ques4();
		asngmt2_Ques4.Find(arr,sum);
		

	}

}
