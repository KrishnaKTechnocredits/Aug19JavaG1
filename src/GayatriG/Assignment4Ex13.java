//reverse the string on even index

package GayatriG;

public class Assignment4Ex13 {
	static void stringReverse(String input){
		String[] newInput=input.split(" ");
		for(int i=0;i<newInput.length;i++){
			if(i%2==0){
				for(int j=newInput[i].length()-1;j>=0;j--){
					System.out.print(newInput[i].charAt(j));
				}
			}
			else{
				for(int j=0;j<newInput[i].length();j++){
					System.out.print(newInput[i].charAt(j));
				}
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		String str="this is techno credits";
		stringReverse(str);
	}
}
