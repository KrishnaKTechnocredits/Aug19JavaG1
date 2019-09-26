package VarshaT;

public class Asngmt2_Ques7 {

	void Sum_Finder(int a[], int sum)
	{
		for(int i=0;i<a.length;i++)
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
		int arr[]={2,4,3,5,7,8,9,0};
		int sum=7;
		Asngmt2_Ques7 asngmt2_Ques7= new Asngmt2_Ques7();
		asngmt2_Ques7.Sum_Finder(arr,sum);
	}

}
