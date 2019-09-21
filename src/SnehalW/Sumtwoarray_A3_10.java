package SnehalW;
/*10)	WAP to sum of two array
a.	firstArray :- {1, 5, 9, 3, 7}
b.	secondAraay:- {1, 7,  9, 3}
c.	output :- 45
*/
public class Sumtwoarray_A3_10 {
	static int sumarr1,sumarr2;
	public static void main(String[] args) {
	
		int arr1[]= {1, 5, 9, 3, 7};
		int arr2[]= {1, 7,  9, 3};
		
		for(int i=0; i<arr1.length; i++)
		{
			sumarr1= sumarr1+arr1[i];
		}
		for(int j=0; j<arr2.length; j++)
		{
			sumarr2= sumarr2+arr2[j];
		}
		System.out.println("The sum of two array is :"+(sumarr1 +sumarr2));
}
}
