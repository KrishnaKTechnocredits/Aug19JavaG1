package VarshaT;

public class Asngmt2_Ques3 {

	void Find(int a[], int number) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == number) {
				count++;
				break;
			}
		}
		if (count > 0)
			System.out.println("Number is present in array");
		else
			System.out.println("number is not in arr");

	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 7, 4, 6 };
		int number = 8;
		Asngmt2_Ques3 asngmt2_Ques3 = new Asngmt2_Ques3();
		asngmt2_Ques3.Find(arr, number);

	}

}
