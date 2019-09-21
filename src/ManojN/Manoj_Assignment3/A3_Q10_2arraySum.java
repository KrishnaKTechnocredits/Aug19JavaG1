package ManojN.Manoj_Assignment3;

public class A3_Q10_2arraySum {
	static void sumOfArray(){
		int x[]={1, 5, 9, 3, 7};
		int y[] = {1, 7,  9, 3};
		int sum1=0;
		int sum2=0;
		for (int i=0; i<x.length; i++){
			sum1 = sum1+x[i];
		}
		for (int i=0; i<y.length; i++){
			sum2 = sum2+y[i];
		}
		System.out.println("Sum of 2 arrays : "+ (sum1+sum2));
	}
	public static void main(String[] args) {
		sumOfArray();
	}
}
/*10)	WAP to sum of two array
a.	firstArray :- {1, 5, 9, 3, 7}
b.	secondAraay:- {1, 7,  9, 3}
c.	output :- 45
*/