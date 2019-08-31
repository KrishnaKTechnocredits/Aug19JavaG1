/*
14) WAP to print even number from the array
int a = {15, 24, 52, 49, 62, 10};
output :- {24, 52, 62, 10}
 */
package a2;
public class Q14_Print_even_no {
	public static void main(String[] args) {
		int a []= {15, 24, 52, 49, 62, 10};
		for (int i=0; i<a.length; i++){
				if ( a[i]%2 == 0)
				System.out.print(a[i]+",");
		}
	}
}
