package VarshaT;

public class Asngmt2_Ques6 {

	void Equality(int a[], int b[])
	{
		int count=0;
		if(a.length==b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
				count++;
				
		}
		if (count==a.length)
			System.out.println("Arrays are equal");
		else
			System.out.println("arrays are not equal");
		}
		else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		Asngmt2_Ques6 asngmt2_Ques6 = new Asngmt2_Ques6();
		int a[] = { 21, 57, 11, 37, 25};
		int b[] = { 21, 57, 11, 37, 25};
		asngmt2_Ques6.Equality(a, b);

	}

}
