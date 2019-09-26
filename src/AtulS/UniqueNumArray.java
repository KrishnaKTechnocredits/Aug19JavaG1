//WAP to print unique number from the two different array
package AtulS;

public class UniqueNumArray {

	void finduniquenum(int[] arr, int[] arr1) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int j = 0; j < arr1.length; j++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr1[j] == arr[i]) {
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println(arr1[j]);
		}
	}

	public static void main(String[] args) {
		UniqueNumArray num = new UniqueNumArray();
		int[] arr = { 1, 3, 6, 9, 7, 14, 225,1544,23,59,67 };
		int[] arr1 = { 2, 5, 6, 9, 8, 10, 14, 226, 225 };
		num.finduniquenum(arr, arr1);
	}

}
