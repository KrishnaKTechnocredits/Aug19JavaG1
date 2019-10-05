package VishakhaP;

public class ReverseTheWord {
	public void reverse(String str)
	   {
		
		String[] words = str.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j= word.length()-1;j >= 0;j--)
	           {
	        	   
		        reverseWord = reverseWord + word.charAt(j);
		       }
		   reverseString = reverseString + reverseWord ;
		  // reverseString = reverseString + reverseWord + "";

		}
		System.out.println(str);
		System.out.println(reverseString);
	   }
	   public static void main(String[] args) 
	   {
		ReverseTheWord obj = new ReverseTheWord();
		obj.reverse("hello good morning to all");
	   }
}
	


