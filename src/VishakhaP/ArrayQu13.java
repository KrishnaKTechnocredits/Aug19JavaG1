package VishakhaP;

public class ArrayQu13 {
	 static void reverse(int a[], int n) 
	    { 
	        int i, k, p; 
	        for (i = 0; i < n / 2; i++) { 
	            p = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = p; 
	        } 
	        System.out.println("Reversed array is : "); 
	        for (k = 0; k < n; k++) { 
	            System.out.println(a[k]); 
	        } 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int [] array = {5,6,9,10,14,63}; 
	        reverse(array, array.length); 
	    } 
	} 