/* 2)	WAP to find max length String from the given array.
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
*/
package DimpleB;
public class StringArrayProblem2 {
	
	void maxlenstring()
	{
		int i=0,max=0;
		String maxstr="";
		String str[]={"all the best","technocredits","","maharashtra"};
		String str1=str[0].replaceAll(" ", "");
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringArrayProblem2 strmax=new StringArrayProblem2();
		strmax.maxlenstring();
	}

}
