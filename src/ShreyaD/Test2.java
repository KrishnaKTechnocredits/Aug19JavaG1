package ShreyaD;

public class Test2 {

	void result(String s)
	{
		String s1[]=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=1;j<=s1[i].length();j++)
			{
				char s2[]=s1[i].toCharArray();
				if(j%2!=0)
				{
					res+=s2[j-1];
				}
			}
			res+=" ";
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Test2 obj= new Test2();
		obj.result("Techno Credits Tender Steps School Baner");
		

	}

}

