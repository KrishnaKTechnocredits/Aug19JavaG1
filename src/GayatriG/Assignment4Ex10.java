//WAP to character occurring in user defined String and Character 

package assignment4;

public class Assignment4Ex10 {
	static void charOccurence(String str, char ch){
		int cnt=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				cnt++;
			}
		}
		System.out.println("Char is "+ch+" and number of ocuurence is "+cnt);
	}
	public static void main(String[] args) {
		String str="hello how are you harsh? ";
		char ch='h';
		charOccurence(str,ch);
	}
}
