package SnehalW;

public class Countchar_A4_10 {
/*Input:hello how are you harsh?
 * input:h
 * output: h occurs 4 time*/
	public static void main(String[] args) {
		String str = "hello how are you harsh ?";
		int count=0;
	
		for(int i=0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)=='h')
			{
				count++;
			}
		}
		System.out.println("Character h occurs " + count+" times ");		
	}
}
