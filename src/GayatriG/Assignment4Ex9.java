// WAP to revers the word

package GayatriG;

public class Assignment4Ex9 {
	static void stringReverse(String input){
		String[] newInput=input.split(" ");
		for(int i=0;i<newInput.length;i++){
			for(int j=newInput[i].length()-1;j>=0;j--){
				System.out.print(newInput[i].charAt(j));
			}
		}
	}
	public static void main(String[] args) {
		String str="hello good morning to all ";
		stringReverse(str);
		
	}
}
