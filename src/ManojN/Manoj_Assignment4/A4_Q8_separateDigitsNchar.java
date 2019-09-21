package ManojN.Manoj_Assignment4;

public class A4_Q8_separateDigitsNchar {
	public static void main(String[] args) {
		String input= "a1b22sd5e2fw2sd3e";
		String str = "";
		String num = "";
		for(int i=0; i<input.length();i++){
			if (Character.isDigit(input.charAt(i))==true){
				num = num + input.charAt(i);
			}else str = str + input.charAt(i);
		}
		System.out.println(str);
		System.out.println(num);
	}
}
/*
Q8)separate digits and characters from the user define string.
Example:-
Hint:- using ASCII and Charater method
input:- a1b22sd5e2fw2sd3e
output:-absdefwsde 122523
*/