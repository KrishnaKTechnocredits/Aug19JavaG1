package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q15_stringLength7 {
	static String [] inputArray(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter #of element of array");
		String arr [] = new String[sc.nextInt()];
		for (int i =0; i<arr.length; i++){
			System.out.println("Enter element " + (i+1)+ " :");
			arr[i] = sc.next();
		}
		sc.close();
		return arr;
	}
	static void stringLength_7 (String arr1[]){
		System.out.print("String with 7 or more length is : ");
		for (int i =0; i<arr1.length; i++){
		if (arr1[i].length() >=7){
			System.out.print(arr1[i]+" ,");
		}
		}
	}
	public static void main(String[] args) {
		stringLength_7(inputArray());
	}
}
/*
15)	WAP to find string which has length more than 7 characheter.
a.	Input array ={“krishna”, “maulik”, “aakash”, “harsh”, 
“aakansha”, ”abhishek”}\
b.	Output :- Krishna, aakansha, abhishek
*/