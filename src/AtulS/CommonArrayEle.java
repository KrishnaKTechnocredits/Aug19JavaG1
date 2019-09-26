//WAP to print common number from two different array
package AtulS;

public class CommonArrayEle {

	void commonele(int[] arr,int[] arr1)
	{
		for (int j = 0; j < arr1.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr1[j] == arr[i]) {
					System.out.println(arr1[j]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		CommonArrayEle num = new CommonArrayEle();
		int[] arr = { 1, 3, 6, 9, 7, 14, 225,1544,23,59,67,226,12,15,49,32,67,23};
		int[] arr1 = { 2, 5, 6, 9, 8, 10, 14,226};
		num.commonele(arr, arr1);

	}

}
