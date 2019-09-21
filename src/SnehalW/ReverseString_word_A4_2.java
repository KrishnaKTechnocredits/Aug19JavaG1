package SnehalW;

/*WAP to revers a full String and particular word also.
 * input = “there is an apple”
output = “elppanasiereht”
 */
public class ReverseString_word_A4_2 {
	
	public static void main(String[] args) {
		String reverse="";
		String str ="there is an apple";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse.replace(" " , ""));		
	}

}
