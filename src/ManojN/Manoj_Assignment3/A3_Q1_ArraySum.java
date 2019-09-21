package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q1_ArraySum {
	static int[] creatArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of elements :");
		int arraySize= sc.nextInt();
		
		int arr1 [] = new int [arraySize];
		for(int i=0;i<arr1.length;i++){
			System.out.println("Please enter element " + (i+1) + ":");
			arr1[i]=sc.nextInt();
		}sc.close();
		return arr1;
		
	}
	 static void positiveNegative(int arr2[]){
		int posSum=0;
		int negSum=0;
		boolean flag = false;
		 for (int i=0; i<arr2.length; i++){
			 
			 if (arr2[i]<0){
				flag = true;
				negSum=negSum+arr2[i];				
			}else if (arr2[i]>0) {
				flag = false;
				posSum=posSum+arr2[i];
			}
			if (flag == false)
			System.out.println( "positive # : "+ arr2[i]);
			if (flag == true)
			System.out.println( "negative # : "+ arr2[i]);
			}
		 System.out.println("positive number sum  = "+ posSum);
		 System.out.println("negative number sum  = "+ negSum);
	}
	
	
	public static void main(String[] args) {
		positiveNegative(creatArray());
		
	}
}

/*
1)	WAP which fulfill below condition
a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a.	positive number = {5, 6, 14, 6, 7}
b.	negative number = {-9, -25, -14}
c.	positive number sum :- 38
d.	negative number sum :- 48
 */
 
 
