package SnehalW;
/*
2) WAP to find max length String from the given array.
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class MaxlengthStr_3_2 {

	public static void main(String[] args) {

	String str[] = {"all the best", "technocredits", "", "maharashtra"};
	
    String maxlenstr = str[0];
    for(int i = 0; i < str.length; i++)
    { 
    	if(maxlenstr.length() < str[i].length())
    	{
    		maxlenstr = str[i];
    		System.out.println(maxlenstr);
    	}
    }
 }
}
