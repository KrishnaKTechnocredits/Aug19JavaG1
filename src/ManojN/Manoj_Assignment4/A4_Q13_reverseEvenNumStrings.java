package ManojN.Manoj_Assignment4;

public class A4_Q13_reverseEvenNumStrings {
	public static void main(String[] args) {
		String s = "This is techno credits";
		String split[] = s.split(" ");
		String rev = "";
		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0){
				for (int j = split[i].length() - 1; j >= 0; j--) {
					rev = rev + split[i].charAt(j);
				}System.out.print(rev+ " ");rev = "";
			}
			else {System.out.print(split[i]+ " ");
			}
		}
	}
}
/*
 * Q13) reverse even # strings 
 * input : This is techno credits 
 * output : siht is
 * onhcet credits
 */