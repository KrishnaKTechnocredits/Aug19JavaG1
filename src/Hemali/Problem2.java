package Hemali;

public class Problem2 {
	
	void reverse()
	{
		String str="there is an apple";
		String str2="";
		String str1=str.replaceAll(" ", "");
		System.out.println(str1);
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+(str1.charAt(i));
		}
		
		
		System.out.println("Reverse string is : "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2 problem2=new Problem2();
		problem2.reverse();
	}

}
