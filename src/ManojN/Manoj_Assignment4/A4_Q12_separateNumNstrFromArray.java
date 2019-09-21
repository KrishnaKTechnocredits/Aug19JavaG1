package ManojN.Manoj_Assignment4;

public class A4_Q12_separateNumNstrFromArray {
	static void separateNumStr() {
		String array[] = { "xyz", "77", "101", "99", "abc" };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (array[i].contains(("" + j)) == true) {
					count = 1;
				}else count = 0;
			}
			if (count==1)
				System.out.println("numaric :"+array[i]);
			else
				System.out.println("string :" +array[i]);
		}
	}

	public static void main(String[] args) {
		separateNumStr();
	}
}
/*
 * Q12) WAP to separate numeric and string value from the array Example:- Hint:-
 * go with contains 0 to 9 input:- String array[] = {"xyz", "77", "101", "99",
 * "abc”} output:- numeric: 77, 101, 99 string: xyz, abc
 */