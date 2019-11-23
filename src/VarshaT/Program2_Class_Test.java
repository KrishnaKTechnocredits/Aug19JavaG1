//Find odd char from individual word 
//input:- "Techno Credits Tender Steps School Baner"
//output" "Tcn Ceis Tne Ses Sho Bnr"
package VarshaT;

public class Program2_Class_Test {
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
		Program2_Class_Test obj= new Program2_Class_Test();
		obj.result("Techno Credits Tender Steps School Baner");
		

	}

}
