// Find the largest of three numbers using Logical And operator

package GayatriG;

public class Assignment5Ex1 {
	static void largestNum(int i, int j, int k) {
		if(i>j && i>k){
			System.out.println("Largest no is : "+i);
		}
		else if(j>i && j>k){
			System.out.println("Largest no is : "+j);
		}
		else{
			System.out.println("Largest no is : "+k);
		}
		
	}
	public static void main(String[] args) {
		largestNum(8,76,56);
	}

	
}
