package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q9_arrayAverage {
	static int[] acceptArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int arr1[]= new int [sc.nextInt()];
		System.out.println("Enter "+ arr1.length +  " array elements :");
		for (int i=0; i<arr1.length; i++){
			arr1[i]=sc.nextInt();
		}
		sc.close();
		return arr1;
	}
	static float average(int arr3[]){
		float sum=0;
		for(int i=0; i<arr3.length; i++){
		 sum = sum + arr3[i];
		}
		float avg = sum / arr3.length;
		return avg;
	}
	public static void main(String[] args) {
		int arr2[] = acceptArray();
		System.out.println(average(arr2));
	}
}
/* Q9)	WAP to find average of user given array
a.	Input :- {14, 32, 19, 14, 78,36}
b.	Output:- 32.16
*/