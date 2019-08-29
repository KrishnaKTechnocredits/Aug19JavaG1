//Find max value at differed index
package AtulS;

public class DifferIndexMaxValue {

	void differarrays(int[] arr, int[] arr1) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr1[i]) {
				if (arr[i] < arr1[i] & max < arr[i] || max < arr1[i]) {
					max = arr1[i];
				} else if (arr[i] > arr1[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println("Max value at differed index: " + max);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 9, 14, 312 };
		int[] arr1 = { 10, 2, 18, 245, 132 };
		DifferIndexMaxValue differ = new DifferIndexMaxValue();
		differ.differarrays(arr, arr1);

	}

}
