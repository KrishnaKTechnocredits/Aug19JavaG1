//14)	WAP to find unique number from given array store that numbers in new array. 

package GayatriG;

public class Assignment3Ex14 {
	static void uniqueNo(int[] input1, int[] input2) {
		int index = 0;
		int[] newArr = new int[input1.length + input2.length];
		for (int i = 0; i < input1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (input1[i] == newArr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				newArr[index] = input1[i];
				index++;
			}
		}
		for (int i = 0; i < input2.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (input2[i] == newArr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				newArr[index] = input2[i];
				index++;
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 2, 0, 5 };
		int arr2[] = { 5, 6, 7, 8, 9, 7 };
		uniqueNo(arr1, arr2);
	}
}
