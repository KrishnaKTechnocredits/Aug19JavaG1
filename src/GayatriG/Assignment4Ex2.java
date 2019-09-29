//2) WAP to revers a full String and particular word also.
//Example:-  input = “there is an apple”  
//output = “elppanasiereht” 

package GayatriG;

public class Assignment4Ex2 {
	void reverseString(String str){
		str=str.replaceAll(" ", "");
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str="there is an apple";
		Assignment4Ex2 assignment4ex2=new Assignment4Ex2();
		assignment4ex2.reverseString(str);
	}
}
