package VarshaT;

public class Asngmt2_Ques8 {
	void Sum_Finder(int a[], int b[])
	{
		if(a.length==b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				System.out.println("values are not matchimg at:"+i);
				break;
			}
		}
		}
		else
			System.out.println("Arrays are not comparable");
		
	}
	public static void main(String[] args) {
		int a[]={10,2,9,14,3};
		int b[]={10,2,18,14,3};
		Asngmt2_Ques8 asngmt2_Ques8= new Asngmt2_Ques8();
		asngmt2_Ques8.Sum_Finder(a,b);
	}

}
