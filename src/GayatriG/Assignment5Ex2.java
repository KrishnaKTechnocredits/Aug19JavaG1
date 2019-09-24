// Find greater of two numbers using ternary operator. 

package GayatriG;

public class Assignment5Ex2 {
	static int greatestNo(int i,int j){
		return(i>j)?i:j;
	}
	public static void main(String[] args) {
		int maxNo=greatestNo(67,6);
		System.out.println(maxNo);
	}
}
