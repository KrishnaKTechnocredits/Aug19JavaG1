package ManojN.Manoj_Assignment3;

public class A3_Q6_reverseString {
	String stringLength(String arr []){
		String str = "";
		int maxLength=0;
		for (int i=0; i<arr.length; i++) {
			if (maxLength<arr[i].length()){
				maxLength=arr[i].length();
				str= arr[i];
			}	
		}
		System.out.println("max length of string : " + maxLength);
		return str;
	}
	public static void main(String[] args) {
		String inputArray [] = {"all the best", "technocredits", "", "maharashtra"};
		A3_Q6_reverseString q6 = new A3_Q6_reverseString();
		String maxStr= q6.stringLength(inputArray);
		System.out.println("max length String : "+ maxStr );
		String reverse = "";
		int i = maxStr.length()-1;
		while ( i>=0){
			char ch = maxStr.charAt(i);
			reverse = reverse + String.valueOf(ch);
			i--;
		}
		System.out.println("reverse string : " + reverse);
	
	}
}
/*
6)	WAP to find reverse max length string 
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b.	Output Max length string :- Technocredits
c.	Max length string reverse value :- stiderconhcet
*/