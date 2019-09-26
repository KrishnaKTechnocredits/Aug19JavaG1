//Find all pairs on integer array whose sum is equal to given number?
package AtulS;

public class PairsSum {

	int convertnum(int num) // convert negative number to positive
	{
		if(num < 0)
			num = num * -1;
		return num;
	}
	void sum(int[] arr, int num) {		//validate the sum of elements equal to given num
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (convertnum(arr[i]) + convertnum(arr[j]) == num) {
					System.out.println("Elements " + arr[i] + " and " + arr[j] + " having sum " + num);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { -2, 4, 3, -5, 7, 9, 8 };
		PairsSum pair = new PairsSum();
		pair.sum(arr, 7);

	}

}
