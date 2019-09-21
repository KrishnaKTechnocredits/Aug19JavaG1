package VarshaT;

public class Asngmt2_Ques13 {
	void Reverse(int a[])
	{
		int x=a.length;
		int b[]=new int[x];
		for(int i=0,j=x-1;i<a.length;i++,j--)
		{
			b[j]=a[i];
		}
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}

	public static void main(String[] args) {
		int a[]={5,6,9,10,14,63};
		Asngmt2_Ques13 asngmt2_Ques13 = new Asngmt2_Ques13();
		asngmt2_Ques13.Reverse(a);
		

	}

}
