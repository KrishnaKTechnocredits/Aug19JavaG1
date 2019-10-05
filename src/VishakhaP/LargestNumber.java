package VishakhaP;

public class LargestNumber {
	public static void main (String args[])
	{
		int a =45;
		int b =60;
		int c =100;
		
		int result =(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println(result);
	}

}
