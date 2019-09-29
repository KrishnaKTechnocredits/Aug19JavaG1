//separate digits and characters from the user define string. 

package GayatriG;

public class Assignment4Ex8 {
	static void digitcharseperation(String input){
		String character="";
		String digit="";
		for(int i=0;i<input.length();i++){
			/*if(input.charAt(i)>=97 && input.charAt(i)<=122){
				
			}
			
			else if(input.charAt(i)>=48 && input.charAt(i)<=57){
				digit=digit+input.charAt(i);
			}*/
			if(Character.isDigit(input.charAt(i))){
				digit=digit+input.charAt(i);
			}
			else{
				character=character+input.charAt(i);
			}
		}
		System.out.println(character+" "+digit);
	}
	public static void main(String[] args) {
		String str="a1b22sd5e2fw2sd3e ";
		digitcharseperation(str);
		
	}
}
