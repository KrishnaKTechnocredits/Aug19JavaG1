package ManojN.Manoj_Assignment3;

public class A3_Q14_uniqueArray {
	static int index = 0;

	static int[] createArray() {
		int a1[] = { 1, 2, 3, 4, 2, 5, 1 };
		int a2[] = { 5, 6, 7, 8, 9, 7, 5, 1 };
		int newArray[] = new int[a1.length + a2.length];
		int i = 0;
		int j = 0;
		for (i = 0; i < a1.length; i++) {
			int count = 0;
			for (j = 0; j < index; j++) {
				if (a1[i] == newArray[j]) {
					count = 1;
					break;
				}

			}
			if (count == 0) {
				newArray[index] = a1[i];
				index++;
			}
		}
		for (i = 0; i < a1.length; i++) {
			int count = 0;
			for (j = 0; j < newArray.length; j++) {
				if (a2[i] == newArray[j]) {
					count = 1;
					break;
				}

			}
			if (count == 0) {
				newArray[index] = a2[i];
				index++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int array[]=createArray();
		for (int i=0; i<array.length;i++) {
			System.out.print(array [i] +",");
		}
	}
}
/*
 * 14) WAP to find unique number from given array store that numbers in new
 * array. a. firstArray:- {} b. secondArray:- {5,6,7,8,9,7} c. unique array =
 * {1,2,3,4,5,6,7,8,9} i. order can be anything
 */