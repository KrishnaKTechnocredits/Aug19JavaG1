/*6)	WAP to find reverse max length string 
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b.	Output Max length string :- Technocredits
c.	Max length string reverse value :- stiderconhcet
*/

public class StringArrayProblem6 {
	
	void reversemaxlenstring()
	{
		int i=0,max=0;
		String maxstr="";
		String revstr="";
		String str2="";
		String str[]={"all the best","technocredits","","maharashtra"};
		String str1=str[0].replaceAll("\\s", "");
		System.out.println(str1);
		str[0]=str1;
		for(i=0;i<str.length;i++)
		{
			if(str[i].length()>max)
			{
				max=str[i].length();
				maxstr=str[i];
			}
		}
		System.out.println("Maximum length string is :"+maxstr+" having length "+max);
		for(i=maxstr.length()-1;i>=0;i--)
		{
			revstr=maxstr.valueOf(maxstr.charAt(i));
			str2=str2.concat(revstr);
		}
		System.out.println("Maximum length string after reversal is "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringArrayProblem6 strmax=new StringArrayProblem6();
		strmax.reversemaxlenstring();
	}

}
