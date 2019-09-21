//Q2) Find duplicate number on Integer array in Java?

package ManojN.Manoj_Assignment1;

public class Q2arrayDuplicateNumber {

	static void m1(int a2[]){
		//int a2 [] = {0, 3, 1, 2, 3};
		for (int i=0; i<a2.length; i++){
			
			for(int j=i+1;j<a2.length; j++){
				if(a2[i]==a2[j]){
					System.out.println("missing no in array : " + a2[j]);
					
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		int a1 [] = {0, 3, 1, 2, 3};
		m1(a1);
	}
}
