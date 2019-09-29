//WAP to separate numeric and string value from the array 

package GayatriG;

public class Assignment4Ex12 {
	static void seperateNumericString(String[] input){
		String numeric="";
		String string="";
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length();j++){
				if(Character.isDigit(input[i].charAt(j))){
					numeric=numeric+input[i].charAt(j);
				}
				else{
					string=string+input[i].charAt(j);
				}
			}
			numeric=numeric+" ";
			string=string+" ";
		}
		System.out.println("numeric --> "+numeric+"\nstring -->"+string);
	}
	public static void main(String[] args) {
		String array[] = {"xyz", "77", "101", "99", "abc"} ;
		seperateNumericString(array);
	}
}
