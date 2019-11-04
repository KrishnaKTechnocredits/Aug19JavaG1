// WAP to check if a number is Armstrong or not 

package GayatriG;

public class Assignment4Ex5 {
	static void noArmstrong(int input){
		int sum=0;
		int no=input;
		while(no>0){
			int x=no%10;
			sum=sum+(x*x*x);
			no=no/10;
		}
		if(sum==input){
			System.out.println("No is Armstrong");
		}
		else{
			System.out.println("No is not Armstrong");
		}
	}
	public static void main(String[] args) {
		int num=153;
		noArmstrong(num);
	}
}
