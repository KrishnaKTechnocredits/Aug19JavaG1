package SnehalW;
/*WAP to revers the word.
Example:-
input :- hello good morning to all
output:-ollehdooggninromotlla*/

public class Reverseword_A4_9 {

	public static void main(String[] args) {
		String reverse="";
		String str ="hello good morning to all";
		String word[] = str.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
				String word1 = word[i];
		
		for(int j=word1.length()-1; j>=0; j--)
		{
			reverse = reverse + word1.charAt(j);
		}
		}
		System.out.println("Actuall String : "+ str);
		System.out.println("Reverse String : "+ reverse);
	}

}

