package ManojN.Manoj_Assignment3;
public class A3_Q2_maxStringLength {
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
		A3_Q2_maxStringLength q2 = new A3_Q2_maxStringLength();
		
		System.out.println("max length String : "+ q2.stringLength(inputArray));
		}
}

/*
Q2)	WAP to find max length String from the given array.
Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
*/