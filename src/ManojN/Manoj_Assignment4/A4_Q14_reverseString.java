package ManojN.Manoj_Assignment4;
public class A4_Q14_reverseString {
	public static void main(String[] args) {
		String s = "Hi Good Morning All";
		String split[] = s.split(" ");
		String rev = "";
		for (int i = split.length -1; i >=0; i--) {
			for (int j = split[i].length() - 1; j >= 0; j--) {
				rev = rev + split[i].charAt(j);
			}
			System.out.print(rev + " ");
			rev = "";
		}
	}
}
/*
 * Q13) reverse ALL string characters
 * input : Hi Good Morning All 
 * output : llA gninroM dooG iH 
 */